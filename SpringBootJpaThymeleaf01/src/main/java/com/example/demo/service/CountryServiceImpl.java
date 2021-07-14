package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;


@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	private CountryRepository countryRepo;

	@Override
	public void saveCountry(Country country) {
		
		countryRepo.save(country);
	}

	@Override
	public List<Country> showCountries() {
		
		return countryRepo.findAll();
	}

	@Override
	public Country showCountry(int id) {
		
		return countryRepo.findById(id).get();
	}

	@Override
	public void deleteCountry(int id) {
		countryRepo.deleteById(id);
		
	}

}
