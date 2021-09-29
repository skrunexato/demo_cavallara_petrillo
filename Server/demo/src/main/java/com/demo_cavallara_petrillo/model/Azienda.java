package com.demo_cavallara_petrillo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Azienda")
public class Azienda {

	@Id
	@Column(name="IdAzienda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;		
	
	public Azienda(String nome) {
		super();
		this.nome = nome;
	}
	
    @OneToMany(mappedBy = "fornitore")
    Set<FornitoreAzienda> aziende;

	public Azienda(long id, String nome, List<Dipendente> dipendenti) {
		super();
		this.id = id;
		this.nome = nome;
		this.dipendenti = dipendenti;
	}

	@Column (name="Nome")
	private String nome;
	
	@OneToMany(mappedBy="azienda")
	private List<Dipendente> dipendenti;
	
	

	public Azienda() {
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
}
