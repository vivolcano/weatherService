package com.example.weatherservice.services.weatherService;

import com.example.weatherservice.forms.WeatherForm;

public interface WeatherService {
     WeatherForm getTodayWeather();
     void saveWeather();
}
