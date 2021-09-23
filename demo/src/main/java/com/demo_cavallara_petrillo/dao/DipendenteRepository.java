package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;








@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long>,DipendenteRepositoryCustom{

	public List<Dipendente> findByAzienda_id(long id);
	
	@Query("select a.nome From Azienda a "
			+ "LEFT JOIN Dipendente d on a.id = d.azienda.id "
			+ " where d.id = :IdDipendente")
	public String trovaNomeAziendaByDipendente(long IdDipendente);
	
	
}
/*select azienda0_.nome as col_0_0_ from azienda azienda0_ left outer join dipendente dipendente1_ on where dipendente1_.id_dipendente=?*/