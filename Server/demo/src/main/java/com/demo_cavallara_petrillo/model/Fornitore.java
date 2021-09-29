package com.demo_cavallara_petrillo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Fornitore {
	
	@Id
	@Column(name="IdFornitore")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="nome")
	private String nome;
	
    @OneToMany(mappedBy = "azienda")
    Set<FornitoreAzienda> aziende;

    @ManyToOne
	@JoinColumn(name="IdTipoProdotto")
    private TipologiaProdotto tipoProdotto;
    
    
	
	public Fornitore(String nome) {
		super();
		this.nome = nome;
	}
	public Fornitore() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<FornitoreAzienda> getAziende() {
		return aziende;
	}
	public void setAziende(Set<FornitoreAzienda> aziende) {
		this.aziende = aziende;
	}
	public TipologiaProdotto getTipoProdotto() {
		return tipoProdotto;
	}
	public void setTipoProdotto(TipologiaProdotto tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}
	
	
	
}
