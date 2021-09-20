package com.demo_cavallara_petrillo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestioneAnagrafiche {
	
	@GetMapping("/demo")
	public String index() {
		return "Funziona!";
	}
	
	
	
	
}
