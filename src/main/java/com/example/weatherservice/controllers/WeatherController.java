package com.example.weatherservice.controllers;

import com.example.weatherservice.forms.WeatherForm;
import com.example.weatherservice.services.dateService.DateService;
import com.example.weatherservice.services.weatherService.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WeatherController {

    @Autowired
    WeatherService weatherService;
    @Autowired
    DateService dateService;

    @GetMapping("/weather")
    public String getWeather() {

        WeatherForm weather = weatherService.getTodayWeather();
        return dateService.getFormatDate(weather.getDate()) + ", " + weather.getValue();
    }
}
