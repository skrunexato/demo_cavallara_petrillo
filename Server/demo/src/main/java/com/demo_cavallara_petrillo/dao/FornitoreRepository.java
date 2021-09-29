package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Fornitore;
import com.demo_cavallara_petrillo.model.TipologiaProdotto;

@Repository
public interface FornitoreRepository extends JpaRepository<Fornitore, Long>, FornitoreRepositoryCustom{

	@Query("select new com.demo_cavallara_petrillo.model.Fornitore(f.nome) FROM Azienda a "
			+ "JOIN FornitoreAzienda az on az.azienda.id = a.id "
			+ "JOIN Fornitore f on f.id = az.fornitore.id "
			+ "where az.azienda.id =?1")
	public List<Fornitore> getFornitoreByAzienda(long idaz);
}
