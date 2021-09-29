package com.demo_cavallara_petrillo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo_cavallara_petrillo.dto.AziendaDto;
import com.demo_cavallara_petrillo.dto.DipendenteDto;
import com.demo_cavallara_petrillo.dto.FornitoreDto;
import com.demo_cavallara_petrillo.dto.TipologiaProdottoDto;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;
import com.demo_cavallara_petrillo.model.Fornitore;



public interface AppService {

	public List<Dipendente> getAllDipendenti();
	
	public DipendenteDto insertDipendente(DipendenteDto dto);

	public DipendenteDto updateDipendente(DipendenteDto dto);
	
	public void deleteDipendente(DipendenteDto dto);
	
	public List<Dipendente> findDipendenteByAzienda(AziendaDto azienda);
	
	public String findNomeAziendaByDipendente(DipendenteDto dip);
	
	public AziendaDto insertAzienda(AziendaDto dto);
	   
    public List<Azienda> getAllAziende();
    
    public List<Dipendente> getDipendenteForEmail();

    public List<Fornitore> getFornitoriByAzienda(AziendaDto dto);
    
    public List<Fornitore> getFornitoriByTipoProdotto(TipologiaProdottoDto dto);


}
