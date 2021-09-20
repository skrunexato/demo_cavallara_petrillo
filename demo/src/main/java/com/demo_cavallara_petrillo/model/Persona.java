package com.demo_cavallara_petrillo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "Persona")
public class Persona {
	
	@Id
	@Column(name="IdPersona")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column (name="Nome")
	private String Nome;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


}
