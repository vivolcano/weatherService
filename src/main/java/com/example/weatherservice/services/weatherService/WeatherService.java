package com.example.weatherservice.services.weatherService;

import com.example.weatherservice.forms.WeatherForm;
import com.example.weatherservice.repositories.WeatherRepository;
import com.example.weatherservice.services.dateService.DateService;
import com.example.weatherservice.services.yandexService.YandexWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepository weatherRepository;
    @Autowired
    YandexWeatherService yandexWeatherService;
    @Autowired
    DateService dateService;

    public WeatherForm getTodayWeather() {

        List<WeatherForm> weatherList = weatherRepository.findAll();
        Date date = new Date();

        for (WeatherForm weather : weatherList) {
            if (dateService.dateEquals(date, weather.getDate())) {
                return weather;
            }
        }
        saveWeather();
        return getTodayWeather();
    }

    public void saveWeather() {
        try {
            WeatherForm weather = new WeatherForm (
                    yandexWeatherService.getDate(),
                    yandexWeatherService.getValue()
            );
            weatherRepository.save(weather);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
