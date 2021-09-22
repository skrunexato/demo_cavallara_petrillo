package com.demo_cavallara_petrillo.services;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo_cavallara_petrillo.dao.DipendenteRepository;
import com.demo_cavallara_petrillo.dto.DipendenteDto;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;

@Service
public class ServiceImpl implements AppService {

	@Autowired
	private DipendenteRepository dipendenteRep;

	private DozerBeanMapper mapper = new DozerBeanMapper();

	@Override
	public List<Dipendente> getAllDipendenti() {
		List<Dipendente> dipendenti = dipendenteRep.findAll();
		return dipendenti;
	}

	@Override
	public DipendenteDto insertDipendente(DipendenteDto dto) {
		Dipendente dipendente = mapper.map(dto, Dipendente.class);
		Dipendente res = dipendenteRep.saveAndFlush(dipendente);
		DipendenteDto result = mapper.map(res, DipendenteDto.class);
		return result;
	}

	public DipendenteDto updateDipendente(DipendenteDto dto) {
		Dipendente dipendente = mapper.map(dto, Dipendente.class);
		Dipendente res = dipendenteRep.save(dipendente);
		DipendenteDto result = mapper.map(res, DipendenteDto.class);
		return result;
	}

	public void deleteDipendente(DipendenteDto dto) {
		Dipendente dipendente = mapper.map(dto, Dipendente.class);
		dipendenteRep.delete(dipendente);
	}

/*	public List<Dipendente> findDipendenteByAzienda(Azienda azienda) {
		Azienda az = mapper.map(azienda, Azienda.class);
		List<Dipendente> lista = dipendenteRep.findDipendenteByIdAzienda(az.getId());
		return lista;
	}*/

}
