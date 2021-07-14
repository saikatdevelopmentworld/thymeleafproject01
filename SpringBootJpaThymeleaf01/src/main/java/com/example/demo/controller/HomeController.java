package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryServiceImpl;

@Controller
public class HomeController {
	@Autowired
	private CountryServiceImpl countryService;
	@RequestMapping("/")
	public String welcome() {
		return "index.html";
	}
	
	@RequestMapping("/list_countries")
	public String countryList(Model model) {
		List<Country> list = countryService.showCountries();
		model.addAttribute("countries",list);
		return "country.html";
	}
	
	//{id} is a path variable
	@RequestMapping("/delete/{id}")
	public String deleteCountry(@PathVariable(name="id") int id) {
		countryService.deleteCountry(id);
		return "redirect:/list_countries" ;
		
	}
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCountry(@PathVariable(name="id")int id) {
		//Adding view
		ModelAndView mav = new ModelAndView("edit_country.html");
		Country country = countryService.showCountry(id);
		//Adding object
		mav.addObject("country", country);
		return mav;
		
	}
	
	@RequestMapping(value ="/save", method = RequestMethod.POST)
	public String saveCountry(@ModelAttribute("country") Country country) {
		countryService.saveCountry(country);
		return "redirect:/list_countries";
	}
	
	@RequestMapping("/new")
	public String showNewCountryForm(Model model) {
		Country country = new Country();
		model.addAttribute("country", country);
		return "add_country.html";
	}
}
