package com.hp.msaWeatherCollectionEurekaFeign.service;

import org.springframework.stereotype.Service;


public interface WeatherDataCollectionService {

    void syncDataByCityId(String cityId);
}
