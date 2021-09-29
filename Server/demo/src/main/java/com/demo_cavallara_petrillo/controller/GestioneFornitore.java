package com.demo_cavallara_petrillo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_cavallara_petrillo.dto.AziendaDto;
import com.demo_cavallara_petrillo.dto.FornitoreDto;
import com.demo_cavallara_petrillo.dto.TipologiaProdottoDto;
import com.demo_cavallara_petrillo.model.Fornitore;
import com.demo_cavallara_petrillo.model.TipologiaProdotto;
import com.demo_cavallara_petrillo.services.AppService;

@RestController
@RequestMapping("/fornitore")
public class GestioneFornitore {

	@Autowired
	AppService service;

	
	
	@GetMapping("/fornitoreByAzienda")
	public List<Fornitore> getFornitoreByAzienda(@RequestBody AziendaDto dto) {
		List<Fornitore> lista = service.getFornitoriByAzienda(dto);
		return lista;
	}
	
	@GetMapping("/fornitoreByTipoProdotto")
	public List<Fornitore> getFornitoreByTipoProdotto(@RequestBody TipologiaProdottoDto tip){
		List<Fornitore> lista = service.getFornitoriByTipoProdotto(tip);
		return lista;
	}
	
}
