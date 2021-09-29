package com.demo_cavallara_petrillo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo_cavallara_petrillo.model.Azienda;


@Repository
public interface AziendaRepository extends JpaRepository<Azienda, Long>{

}
