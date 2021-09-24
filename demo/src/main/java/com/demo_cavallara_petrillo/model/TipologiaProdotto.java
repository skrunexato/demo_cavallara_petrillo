package com.demo_cavallara_petrillo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TipoProdotto")
public class TipologiaProdotto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdTipoProdotto")
	private long id;
	
	@Column(name="tipoProdotto")
	private String tipoProdotto;

	@OneToMany(mappedBy="tipoProdotto")
	private List<Fornitore> fornitore;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoProdotto() {
		return tipoProdotto;
	}

	public void setTipoProdotto(String tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}

	public List<Fornitore> getFornitore() {
		return fornitore;
	}

	public void setFornitore(List<Fornitore> fornitore) {
		this.fornitore = fornitore;
	}
	
}
