package com.demo_cavallara_petrillo.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class FornitoreAzienda {

	@EmbeddedId
	private FornitoreAziendaKey idFornitoreAzienda;

    @ManyToOne
    @MapsId("idFornitore")
    @JoinColumn(name = "IdFornitore")
    private Fornitore fornitore;
    
    @ManyToOne
    @MapsId("idAzienda")
    @JoinColumn(name = "IdAzienda")
    private Azienda azienda;
    
}
