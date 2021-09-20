package com.demo_cavallara_petrillo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Dipendente;


@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long>{

}
