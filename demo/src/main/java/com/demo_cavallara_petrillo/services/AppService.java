package com.demo_cavallara_petrillo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo_cavallara_petrillo.dto.DipendenteDto;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;



public interface AppService {

	public List<Dipendente> getAllDipendenti();
	
	public DipendenteDto insertDipendente(DipendenteDto dto);

	public DipendenteDto updateDipendente(DipendenteDto dto);
	
	public void deleteDipendente(DipendenteDto dto);
	
	/*public List<Dipendente> findDipendenteByAzienda(Azienda azienda);*/

}
