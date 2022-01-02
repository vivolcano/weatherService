package com.example.weatherservice.services.yandexService.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

@Data
public class GeoObject {

    private final JsonNode district;
    private final Locality locality;
    private final JsonNode province;
    private final JsonNode country;

    @JsonCreator
    public GeoObject(
            @JsonProperty("district") JsonNode district,
            @JsonProperty("locality") Locality locality,
            @JsonProperty("province") JsonNode province,
            @JsonProperty("country") JsonNode country
    ) {
        this.district = district;
        this.locality = locality;
        this.province = province;
        this.country = country;
    }

}