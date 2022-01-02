package com.example.weatherservice.controllers;

import com.example.weatherservice.forms.WeatherForm;
import com.example.weatherservice.services.weatherService.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather() throws IOException {

        WeatherForm weather = weatherService.getTodayWeather();

        return weather.getDate() + ": " + weather.getValue();
    }
}
