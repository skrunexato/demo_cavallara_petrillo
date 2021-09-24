package com.demo_cavallara_petrillo.dto;

import com.demo_cavallara_petrillo.model.TipologiaProdotto;

public class FornitoreDto {

	private long id;
	private String nome;
    private TipologiaProdotto tipoProdotto;
	
    
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
	public TipologiaProdotto getTipoProdotto() {
		return tipoProdotto;
	}
	public void setTipoProdotto(TipologiaProdotto tipoProdotto) {
		this.tipoProdotto = tipoProdotto;
	}
}
