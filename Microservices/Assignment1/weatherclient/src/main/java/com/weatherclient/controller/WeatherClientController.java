package com.weatherclient.controller;

import com.weatherclient.dto.WeatherDto;
import com.weatherclient.serviceproxy.WeatherServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherClientController {
    private WeatherServiceProxy weatherserviceproxy;

    @Value("${server.port}")
    private int portNumber;

    @Autowired
    public WeatherClientController(WeatherServiceProxy weatherserviceproxy){
        this.weatherserviceproxy=weatherserviceproxy;
    }

    public WeatherDto getWeatherInfo(@PathVariable  int temperature){
        String weatherInfo = weatherserviceproxy.getWeatherInfo(temperature);
        return new WeatherDto(weatherInfo, portNumber);
    }
}
