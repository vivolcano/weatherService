package com.example.weatherservice.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="weather_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "weather_date")
    private Date date;

    @Column(name = "weather_value")
    private String value;

    public WeatherForm(Date date, String value) {
        this.date = date;
        this.value = value;
    }

    @Override
    public String toString() {
        return "WeatherForm {" +
                "date=" + date +
                ", value='" + value + '\'' +
                '}';
    }
}

