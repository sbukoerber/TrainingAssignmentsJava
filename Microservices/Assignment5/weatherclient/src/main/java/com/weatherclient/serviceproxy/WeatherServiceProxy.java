package com.weatherclient.serviceproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient
public class WeatherServiceProxy {
    @GetMapping("weatherservice/{temperature}")
    public String getWeatherInfo(int temperature) {
        return null;
    }

}
