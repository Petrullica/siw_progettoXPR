package model;

import java.util.HashSet;
import java.util.Set;

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
	
	@ManyToOne
	private TipologiaEsame tipologiaEsame;

	public IndicatoreRisultato() {
	}

	public IndicatoreRisultato(String nome) {
		this.nome = nome;
	}
	
	

	public IndicatoreRisultato(String nome, TipologiaEsame tipologiaEsame) {
		super();
		this.nome = nome;
		this.tipologiaEsame = tipologiaEsame;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}