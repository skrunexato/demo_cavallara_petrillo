package com.demo_cavallara_petrillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Table(name = "Dipendente")
public class Dipendente {
	
	@Id
	@Column(name="IdDipendente")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column (name="Nome")
	private String nome;
	
	@Column(name = "Cognome")
	private String cognome;
	
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Email")
	private String email;


}

