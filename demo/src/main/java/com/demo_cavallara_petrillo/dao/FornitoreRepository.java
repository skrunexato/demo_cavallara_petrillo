package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Fornitore;

@Repository
public interface FornitoreRepository extends JpaRepository<Fornitore, Long>{
	
	
	/*public List<Fornitore> getFornitoreByTipo(Fornitore fo);*/

}
