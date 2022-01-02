package com.example.weatherservice.services.yandexService.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Locality {
    private final int id;
    private final String name;

    @JsonCreator
    public Locality(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name
    ) {
        this.id = id;
        this.name = name;
    }
}
