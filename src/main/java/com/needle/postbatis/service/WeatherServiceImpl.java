package com.needle.postbatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needle.postbatis.mapper.WeatherMapper;
import com.needle.postbatis.model.Weather;
import com.needle.postbatis.model.WeatherExample;



@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherMapper weatherMapper;

	@Override
	public int saveWeather(Weather weather) {
		// TODO Auto-generated method stub
		if (weather != null)
			return weatherMapper.insert(weather);
		else return 0;

	}

	@Override
	public List<Weather> getWeathers() {
		WeatherExample example = new WeatherExample();
		return weatherMapper.selectByExample(example);
	}

	@Override
	public Weather getWeather(Long id) {
		WeatherExample example = new WeatherExample();
		if (id != null) {
			example.createCriteria().andIdEqualTo(id);
		}
		List<Weather> weatherList = weatherMapper.selectByExample(example);
		if(!weatherList.isEmpty()) {
			return weatherList.get(0);
		}
		return null;
	}

	@Override
	public Weather updateWeather(Weather weather) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Weather getWeatherByCity(String city) {
		WeatherExample example = new WeatherExample();
		if (city != null) {
			example.createCriteria().andCityEqualTo(city);
		}
		List<Weather> weatherList = weatherMapper.selectByExample(example);
		if(!weatherList.isEmpty()) {
			return weatherList.get(0);
		}
		return null;

	}
}
