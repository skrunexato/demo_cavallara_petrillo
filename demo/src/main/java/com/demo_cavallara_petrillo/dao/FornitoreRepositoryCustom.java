package com.demo_cavallara_petrillo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Fornitore;
import com.demo_cavallara_petrillo.model.TipologiaProdotto;

@Repository
public interface FornitoreRepositoryCustom {
	
	public List<Fornitore> getFornitoreByTipologiaProdotto(TipologiaProdotto tipoP);

}
