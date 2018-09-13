package com.hp.msaWeatherCollectionEurekaFeign.service;

import com.hp.msaWeatherCollectionEurekaFeign.vo.City;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "msa-weather-city-eureka:8081")
public interface CityClient {

    @GetMapping("/cities")
    List<City> listCity() throws Exception;
}
