package com.sutaruhin;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;

	public List<Country> getCountryList(){
		return repository.findAll();
	}

	public Country getCountry(String code) {
//		レコードを1件検索する
		Optional<Country> option = repository.findById(code);
//　レコードを取得できなかったときはnullを返す
		Country country = option.orElse(null);
		return country;
	}

	@Transactional
	public void updateCountry(String code,String name,int population) {
		Country country = new Country(code,name,population);
		repository.save(country);
	}

	@Transactional
	public void deleteCountry(String code) {
		repository.deleteById(code);

	}
}
