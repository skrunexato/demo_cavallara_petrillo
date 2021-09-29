package com.demo_cavallara_petrillo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.demo_cavallara_petrillo.model.Dipendente;

public class DipendenteRepositoryImpl implements DipendenteRepositoryCustom {

	@PersistenceContext
    private EntityManager em;

	@Override
	public List<Dipendente> findByName() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
	    CriteriaQuery<Dipendente> criteriaQuery = cb.createQuery(Dipendente.class);

	    Root<Dipendente> dipendenteRoot = criteriaQuery.from(Dipendente.class);
	     criteriaQuery.select(dipendenteRoot.get("nome"));
	    
	    CriteriaQuery<Dipendente> select = criteriaQuery.select(dipendenteRoot);
	    TypedQuery<Dipendente> query = em.createQuery(select);
	    
	    return query.getResultList();
	}
}
