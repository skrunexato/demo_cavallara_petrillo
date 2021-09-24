package com.demo_cavallara_petrillo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_cavallara_petrillo.dto.FornitoreDto;
import com.demo_cavallara_petrillo.model.Fornitore;
import com.demo_cavallara_petrillo.services.AppService;

@RestController
@RequestMapping(name="fornitore")
public class GestioneFornitore {

	@Autowired
	AppService service;

	/*
	
	@GetMapping("/fornitoreByTipo")
	public List<Fornitore> getFornitoreByTipoAndAzienda(@RequestBody FornitoreDto fo) {
		
		List<Fornitore> lista = service.getFornitoreByTipoAndAzienda(fo);
		return lista;
		
	}*/
	
	
	
}
