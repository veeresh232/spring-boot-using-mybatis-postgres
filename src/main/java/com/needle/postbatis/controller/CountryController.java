package com.needle.postbatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.needle.postbatis.dto.EmptyJsonResponse;
import com.needle.postbatis.model.Country;
import com.needle.postbatis.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@PostMapping("/save")
	ResponseEntity<?> saveCountry(@RequestBody Country country) {
		int status = countryService.saveCountry(country);
		if(status==1) {
			return new ResponseEntity(country,HttpStatus.CREATED);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/")
	ResponseEntity getAllCountries() {
		List<Country> countries= countryService.getCountries();
		return new ResponseEntity(countries,HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}")
	ResponseEntity<?> getCountryById(@PathVariable("id") int id) {
		Country country= countryService.getCountry(id);
		if(country!=null) {
			return new ResponseEntity<Country>(country,HttpStatus.OK);
		}
		return new ResponseEntity<EmptyJsonResponse>(new EmptyJsonResponse(),HttpStatus.OK);
	}

}
