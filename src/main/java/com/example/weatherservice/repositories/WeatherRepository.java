package com.example.weatherservice.repositories;

import com.example.weatherservice.forms.WeatherForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository <WeatherForm, Integer> {
}
