package com.needle.postbatis.service;

import java.util.List;

import com.needle.postbatis.model.VCityWeather;

public interface VCityWeatherService {
	List<VCityWeather> callFuncById(int id);
}
