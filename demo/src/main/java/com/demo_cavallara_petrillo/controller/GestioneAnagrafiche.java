package com.demo_cavallara_petrillo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo_cavallara_petrillo.dto.AziendaDto;
import com.demo_cavallara_petrillo.dto.DipendenteDto;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;
import com.demo_cavallara_petrillo.services.AppService;



@RestController
@RequestMapping("/dipendenti")
public class GestioneAnagrafiche {
	
	@Autowired
	AppService service;
	
	@GetMapping("/listaDipendenti")
	public List<Dipendente> getDipendenti() {
		List<Dipendente>listaDip = service.getAllDipendenti();
		return listaDip;
	}
	
	@PostMapping("")
	public DipendenteDto insertDipendente(@RequestBody DipendenteDto dtoDip) {
		DipendenteDto res = service.insertDipendente(dtoDip);
		return res;
		
	}
	
	@PutMapping("")
	public DipendenteDto updateDipendente(@RequestBody DipendenteDto dtoDip) {
		DipendenteDto res = service.updateDipendente(dtoDip);
		return res;
	}
	
	@DeleteMapping("")
	public void deleteDipendente(@RequestBody DipendenteDto dtoDip) {
		service.deleteDipendente(dtoDip);
	}
	
	@GetMapping("/dip-azienda")
	public List<Dipendente> getDipendenteByAzienda(@RequestBody AziendaDto azienda){
		List<Dipendente> lista = service.findDipendenteByAzienda(azienda);
		return lista;
	}
	
/*	@GetMapping("/nomeAzienda")
	public String getNomeAziendaByDipendente(@RequestBody DipendenteDto dip){
		String nome = service.findNomeAziendaByDipendente(dip);
		return nome;
	}*/
	
	
	
}
