package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJpaThymeleaf01ApplicationTests {
	@Autowired
	private CountryRepository countryRepo;

	@Test
	void contextLoads() {
	}
	

	@Test
	 void CountryRepoTesting() {
		Country country = new Country();
		country.setCountry("Canada");
		country.setCurrency("dollar");
		country.setCapitalCity("ottowa");
		country.setPopulation(3325385565L);
		countryRepo.save(country);
		
		System.out.println("Country has been inserted successfully");
	}


}
