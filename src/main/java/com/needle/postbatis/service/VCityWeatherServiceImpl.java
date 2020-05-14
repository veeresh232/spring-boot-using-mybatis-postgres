package com.needle.postbatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needle.postbatis.mapper.VCityWeatherMapper;
import com.needle.postbatis.model.VCityWeather;

@Service
public class VCityWeatherServiceImpl implements VCityWeatherService{
	
	@Autowired
	VCityWeatherMapper vCityWeatherMapper;

	@Override
	public List<VCityWeather> callFuncById(int id) {
		
		return vCityWeatherMapper.callFuncById(id);
		
		
	} 
	

}
