package com.demo_cavallara_petrillo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Azienda;
import com.demo_cavallara_petrillo.model.Dipendente;








@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long>{

	public List<Dipendente> findByAzienda_id(long id);
	
	@Query("SELECT new com.demo_cavallara_petrillo.model.Azienda(a.nome) a left join Dipendente dipendente "
			+ "on  dipendente.Azienda = Azienda.id where Azienda.id = dip.id")
	public String trovaNomeAziendaByDipendente(Dipendente dip);
}
