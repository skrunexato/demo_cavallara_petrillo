package com.demo_cavallara_petrillo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;

import com.demo_cavallara_petrillo.model.Fornitore;
import com.demo_cavallara_petrillo.model.TipologiaProdotto;

public class FornitoreRepositoryImpl implements FornitoreRepositoryCustom{
	
	 @PersistenceContext
	 EntityManager em;

	@Override
	public List<Fornitore> getFornitoreByTipologiaProdotto(TipologiaProdotto tipoP) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Fornitore> q = cb.createQuery(Fornitore.class);
		Root<Fornitore> r = q.from(Fornitore.class);
		q.select(r.get("nome"));
		Predicate p1 = cb.equal(r.get("tipoProdotto"), tipoP);
		q.where(p1);
		TypedQuery<Fornitore> q2 = em.createQuery(q);
		return q2.getResultList();
	}

}
