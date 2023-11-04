package com.sutaruhin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("country")
public class CountryController {
	@Autowired
	private CountryService service;

	@GetMapping("/list")
	public String getList(Model model) {

		model.addAttribute("countrylist", service.getCountryList());

		return "country/list";
	}
}
