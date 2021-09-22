package com.demo_cavallara_petrillo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_cavallara_petrillo.dto.AziendaDto;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;
import com.demo_cavallara_petrillo.services.AppService;

import java.util.List;

@RestController
@RequestMapping("/azienda")
public class GestioneAzienda {

	@Autowired
	AppService service;
	
	@GetMapping("/listaAziende")
	public List<Azienda> listAzienda (){
		List<Azienda> listeAziende = service.getAllAziende();
		return listeAziende;
	}
	
	@PostMapping("")
	public AziendaDto insertAzienda(@RequestBody AziendaDto dtoA) {
		AziendaDto res = service.insertAzienda(dtoA);
		return res;
		
	}
}
