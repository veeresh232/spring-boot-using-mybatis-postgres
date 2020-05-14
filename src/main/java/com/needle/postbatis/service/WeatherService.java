package com.needle.postbatis.service;

import java.util.List;

import com.needle.postbatis.model.Weather;


public interface WeatherService {

	int saveWeather(Weather weather);

	List<Weather> getWeathers();

	Weather getWeather(Long id);

	Weather updateWeather(Weather weather);
	
	Weather getWeatherByCity(String city);
}
