package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Dipendente;

@Repository
public interface DipendenteRepositoryCustom {

	List<Dipendente> findByName();
}
