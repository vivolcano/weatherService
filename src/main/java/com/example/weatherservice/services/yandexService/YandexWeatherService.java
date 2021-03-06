package com.example.weatherservice.services.yandexService;

import com.example.weatherservice.services.dateService.DateService;
import com.example.weatherservice.services.yandexService.dto.Weather;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class YandexWeatherService {
    private static final String YANDEX_URL = "https://api.weather.yandex.ru/v2/forecast";
    private static final String HEADER_API = "X-Yandex-API-Key";
    private static final String API_KEY = "a0335aeb-5c60-45e9-98e8-6cae94192f97";

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Weather getWeather() throws IOException {
        CloseableHttpClient httpClient = httpClientConfig();
        HttpGet request = yandexGetRequest();

        CloseableHttpResponse response = httpClient.execute(request);
        return MAPPER.readValue(response.getEntity().getContent(), new TypeReference<Weather>() {});
    }

    private HttpGet yandexGetRequest() {
        HttpGet request = new HttpGet(YANDEX_URL);
        request.setHeader(HEADER_API, API_KEY);
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        return request;
    }

    private CloseableHttpClient httpClientConfig() {
        return HttpClientBuilder.create()
                .setUserAgent("Yandex Weather")
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setConnectTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();
    }

    public Date getDate() throws IOException {
        DateService dateService = new DateService();
        Weather weather = getWeather();
        return dateService.fromUnixToDate(weather.getNow());
    }

    public String getValue() throws IOException {
        DateService dateService = new DateService();
        Weather weather = getWeather();
        return weather.getGeoObject().getLocality().getName() + ", ??????????????????????: " + weather.getFact().getTemp();
    }
}
