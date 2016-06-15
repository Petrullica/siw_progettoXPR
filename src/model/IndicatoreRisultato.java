package model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.UniqueConstraint;
import javax.persistence.PrimaryKeyJoinColumns;

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