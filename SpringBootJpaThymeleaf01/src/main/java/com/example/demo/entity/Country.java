package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country_thymeleaf")
public class Country {
	@Id
	@Column(name="country_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="country_name")
	
	private String country;
	@Column(name="country_population")
	private long population;
	@Column(name="country_currency")
	private String currency;
	@Column(name="country_capital")
	private String capitalCity;
	
	public Country() {
		
	}

	public Country(String country, long population, String currency, String capitalCity) {
		super();
		this.country = country;
		this.population = population;
		this.currency = currency;
		this.capitalCity = capitalCity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", population=" + population + ", currency=" + currency
				+ ", capitalCity=" + capitalCity + "]";
	}
	

}
