package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Country;


public interface CountryService {
	public void saveCountry(Country country);
	public List<Country> showCountries();
	public Country showCountry(int id);
	public void deleteCountry(int id);
}
