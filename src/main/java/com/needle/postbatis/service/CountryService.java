package com.needle.postbatis.service;

import java.util.List;

import com.needle.postbatis.model.Country;

public interface CountryService {
	int saveCountry(Country country);

	List<Country> getCountries();

	Country getCountry(int id);

	Country updateCountry(Country country);
	
}
