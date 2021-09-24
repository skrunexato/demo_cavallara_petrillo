package com.demo_cavallara_petrillo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FornitoreAziendaKey implements Serializable{
	
	@Column(name="IdAzienda")
	private long idAzienda;
	
	@Column(name="IdFornitore")
	private long idFornitore;

	public long getIdAzienda() {
		return idAzienda;
	}

	public void setIdAzienda(long idAzienda) {
		this.idAzienda = idAzienda;
	}

	public long getIdFornitore() {
		return idFornitore;
	}

	public void setIdFornitore(long idFornitore) {
		this.idFornitore = idFornitore;
	}
	
}
