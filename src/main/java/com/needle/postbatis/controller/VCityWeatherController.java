package com.needle.postbatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.needle.postbatis.model.VCityWeather;
import com.needle.postbatis.service.VCityWeatherService;

@RestController
@RequestMapping("/api/vcityweather")
public class VCityWeatherController {
	
	@Autowired
	VCityWeatherService vCityWeatherService;
	@GetMapping("/{id}")
	ResponseEntity<?> getViewByProcedure(@PathVariable("id")int id){
		List<VCityWeather> list = vCityWeatherService.callFuncById(id);
		return new ResponseEntity<List>(list,HttpStatus.OK);
	}
}
