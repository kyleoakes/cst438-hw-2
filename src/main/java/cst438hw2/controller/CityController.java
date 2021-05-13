package cst438hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cst438hw2.domain.CityRepository;

@Controller
public class CityController {
	
	@GetMapping("/cities/{city}")
	public String getCityInfo(@PathVariable("city") String cityName,
			Model model) {
		//TODO ...something?????
		return "index";
	}
}
