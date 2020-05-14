package com.needle.postbatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needle.postbatis.mapper.CountryMapper;
import com.needle.postbatis.model.Country;
import com.needle.postbatis.model.CountryExample;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	CountryMapper countryMapper;

	@Override
	public int saveCountry(Country country) {
		if(country !=null) {
			return countryMapper.insert(country);
		}
		return 0;
	}

	@Override
	public List<Country> getCountries() {
		CountryExample example=new CountryExample();
		return countryMapper.selectByExample(example);
	}

	@Override
	public Country getCountry(int id) {
		CountryExample example=new CountryExample();
		example.createCriteria().andIdEqualTo(id);
		List<Country> countries= countryMapper.selectByExample(example);
		if(!countries.isEmpty()) {
			return countries.get(0);
		}
		return null;
	}

	@Override
	public Country updateCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

}
