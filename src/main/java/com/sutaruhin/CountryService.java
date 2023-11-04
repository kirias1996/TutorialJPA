package com.sutaruhin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;

	public List<Country> getCountryList(){
		return repository.findAll();
	}
}
