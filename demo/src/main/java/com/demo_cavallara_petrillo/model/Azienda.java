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
@Table(name = "Azienda")
public class Azienda {

	@Id
	@Column(name="IdAzienda")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;	
	
	@Column (name="Nome")
	private String nome;
	
	@OneToMany(mappedBy="azienda")
	private List<Dipendente> dipendenti;

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
