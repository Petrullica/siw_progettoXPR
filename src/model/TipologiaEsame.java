package model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class TipologiaEsame {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String codice;
	
	private String nome;
	
	private String descrizione;
	
	private double costo;
	
	@OneToMany
	private List<Prerequisito> prerequisiti;
	
	@OneToMany
	private List<IndicatoreRisultato> indicatoriRisultato;
	
	public TipologiaEsame(){}
	
	public TipologiaEsame(String nome, String descrizione, double costo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
	}

	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descr) {
		this.descrizione = descr;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}

	public List<IndicatoreRisultato> getIndicatoriRisultato() {
		return indicatoriRisultato;
	}
}