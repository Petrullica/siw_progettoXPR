package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class IndicatoreRisultato {

	@Id
	private String nome;
	
	@ManyToMany(mappedBy = "indicatoriRisultato", cascade = {CascadeType.REFRESH, CascadeType.MERGE})
	private List<TipologiaEsame> tipologieEsame = new LinkedList<>();

	public IndicatoreRisultato() {
	}

	public IndicatoreRisultato(String nome) {
		this.nome = nome;
	}

	public List<TipologiaEsame> getTipologieEsame() {
		return tipologieEsame;
	}

	public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
		this.tipologieEsame = tipologieEsame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}