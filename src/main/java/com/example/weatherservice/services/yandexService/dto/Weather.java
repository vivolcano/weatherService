package com.example.weatherservice.services.yandexService.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class Weather {

    private final int now;
    private final String nowDt;
    private final JsonNode info;
    private final GeoObject geoObject;
    private final JsonNode yesterday;
    private final Fact fact;
    private final JsonNode forecasts;

    @JsonCreator
    public Weather(
            @JsonProperty("now") int now,
            @JsonProperty("now_dt") String nowDt,
            @JsonProperty("info") JsonNode info,
            @JsonProperty("geo_object") GeoObject geoObject,
            @JsonProperty("yesterday") JsonNode yesterday,
            @JsonProperty("fact") Fact fact,
            @JsonProperty("forecasts") JsonNode forecasts
    ) {
        this.now = now;
        this.nowDt = nowDt;
        this.info = info;
        this.geoObject = geoObject;
        this.yesterday = yesterday;
        this.fact = fact;
        this.forecasts = forecasts;
    }
}
