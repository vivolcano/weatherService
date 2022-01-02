package com.example.weatherservice.services.yandexService.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class Fact {
    private final int obsTime;
    private final int uptime;
    private final int temp;
    private final int feelsLike;
    private final int tempWater;
    private final String icon;
    private final String condition;
    private final int cloudness;
    private final int precType;
    private final int precProb;
    private final int precStrength;
    private final boolean isThunder;
    private final int windSpeed;
    private final String windDir;
    private final int pressureMm;
    private final int pressurePa;
    private final int humidity;
    private final String daytime;
    private final boolean polar;
    private final String season;
    private final String source;
    private final JsonNode accumPrec;
    private final double soilMoisture;
    private final int soilTemp;
    private final int uvIndex;
    private final double windGust;

    @JsonCreator
    public Fact(
            @JsonProperty("obs_time") int obsTime,
            @JsonProperty("uptime") int uptime,
            @JsonProperty("temp") int temp,
            @JsonProperty("feels_like") int feelsLike,
            @JsonProperty("temp_water") int tempWater,
            @JsonProperty("icon") String icon,
            @JsonProperty("condition") String condition,
            @JsonProperty("cloudness") int cloudness,
            @JsonProperty("prec_type") int  precType,
            @JsonProperty("prec_prob") int precProb,
            @JsonProperty("prec_strength") int precStrength,
            @JsonProperty("is_thunder") boolean isThunder,
            @JsonProperty("wind_speed") int windSpeed,
            @JsonProperty("wind_dir") String windDir,
            @JsonProperty("pressure_mm") int pressureMm,
            @JsonProperty("pressure_pa") int pressurePa,
            @JsonProperty("humidity") int humidity,
            @JsonProperty("daytime") String daytime,
            @JsonProperty("polar") boolean polar,
            @JsonProperty("season") String season,
            @JsonProperty("source") String source,
            @JsonProperty("accum_prec") JsonNode accumPrec,
            @JsonProperty("soil_moisture") double soilMoisture,
            @JsonProperty("soil_temp") int soilTemp,
            @JsonProperty("uv_index") int uvindex,
            @JsonProperty("wind_gust") double windGust
    ) {
        this.obsTime = obsTime;
        this.uptime = uptime;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempWater = tempWater;
        this.icon = icon;
        this.condition = condition;
        this.cloudness = cloudness;
        this.precType = precType;
        this.precProb = precProb;
        this.precStrength = precStrength;
        this.isThunder = isThunder;
        this.windSpeed = windSpeed;
        this.windDir = windDir;
        this.pressureMm = pressureMm;
        this.pressurePa = pressurePa;
        this.humidity = humidity;
        this.daytime = daytime;
        this.polar = polar;
        this.season = season;
        this.source = source;
        this.accumPrec = accumPrec;
        this.soilMoisture = soilMoisture;
        this.soilTemp = soilTemp;
        this.uvIndex = uvindex;
        this.windGust = windGust;
    }
}

