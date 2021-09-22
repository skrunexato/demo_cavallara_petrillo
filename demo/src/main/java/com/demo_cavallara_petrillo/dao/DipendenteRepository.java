package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;






@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long>{

/*	public List<Dipendente> findDipendenteByIdAzienda(long IdAzienda);*/
}
