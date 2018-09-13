package com.hp.weatherReport.service;

import com.hp.weatherReport.vo.Weather;

public interface WeatherReportService {
    /**
     * 根据城市ID查询天气信息
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);
}
