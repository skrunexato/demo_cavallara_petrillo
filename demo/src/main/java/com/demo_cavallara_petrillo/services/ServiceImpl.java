package com.demo_cavallara_petrillo.services;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.demo_cavallara_petrillo.dao.AziendaRepository;
import com.demo_cavallara_petrillo.dao.DipendenteRepository;
import com.demo_cavallara_petrillo.dto.AziendaDto;
import com.demo_cavallara_petrillo.dto.DipendenteDto;
import com.demo_cavallara_petrillo.hibernate_session.HibernateUtil;
import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;



@Service
public class ServiceImpl implements AppService {

	@Autowired
	private DipendenteRepository dipendenteRep;
	
	@Autowired
	private AziendaRepository aziendaRep;

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


	public List<Dipendente> findDipendenteByAzienda(AziendaDto azienda) {
		Azienda az = mapper.map(azienda, Azienda.class);
		List<Dipendente> lista = dipendenteRep.findByAzienda_id(az.getId());
		return lista;
	}

	public String findNomeAziendaByDipendente(DipendenteDto dip) {
		Dipendente dipendente = mapper.map(dip, Dipendente.class);
		String nome = dipendenteRep.trovaNomeAziendaByDipendente(dipendente.getId());
		return nome;
	}
	
	@Override
    public AziendaDto insertAzienda(AziendaDto dto) {
        Azienda azienda = mapper.map(dto, Azienda.class);
        Azienda res = aziendaRep.saveAndFlush(azienda);
        AziendaDto result = mapper.map(res, AziendaDto.class);
        return result;
    }

    @Override
    public List<Azienda> getAllAziende() {
        List<Azienda> aziende = aziendaRep.findAll();
        return aziende;
    }

	@Override
	public List<Dipendente> getDipendenteForEmail() {
			List<Dipendente> results = dipendenteRep.findByName();
		
		return results;
	}

  

}
