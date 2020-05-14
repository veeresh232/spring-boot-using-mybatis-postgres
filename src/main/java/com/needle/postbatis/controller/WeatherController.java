package com.needle.postbatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.needle.postbatis.dto.EmptyJsonResponse;
import com.needle.postbatis.model.Weather;
import com.needle.postbatis.service.WeatherService;



@RestController
@RequestMapping("/api/weather")
public class WeatherController {

	@Autowired
	WeatherService weatherService;
	
	@GetMapping
	ResponseEntity<List<Weather>> getWeathers(){
		List<Weather> weatherList = weatherService.getWeathers();
		return new ResponseEntity<List<Weather>>(weatherList,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	ResponseEntity<?> getWeatherById(@PathVariable("id")long id){
		Weather weather = weatherService.getWeather(id);
		if(weather !=null)
			return new ResponseEntity<>(weather,HttpStatus.OK);
		else
			return new ResponseEntity<>(new EmptyJsonResponse(),HttpStatus.OK);
	}

	@GetMapping("/city/{city}")
	ResponseEntity<?> getWeatherBycity(@PathVariable("city") String city) {
		
		Weather weather = weatherService.getWeatherByCity(city.toLowerCase());
		if(weather !=null)
			return new ResponseEntity<>(weather,HttpStatus.OK);
		else
			return new ResponseEntity<>(new EmptyJsonResponse(),HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/save")
	ResponseEntity saveWeather(@RequestBody Weather weather) {
		int status = weatherService.saveWeather(weather);
		System.out.println(status);
		return ResponseEntity.ok(weather);
	}
}
