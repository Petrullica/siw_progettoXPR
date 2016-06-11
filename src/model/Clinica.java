package model;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Clinica {
	
	@OneToMany(mappedBy = "clinica")
	private List<Esame> esami;
	
	@OneToMany(mappedBy = "clinica")
	private List<Amministratore> amministratori;
	
	@OneToMany(mappedBy ="clinica")
	private List<Paziente> pazienti;
	
	@OneToMany(mappedBy ="clinica")
	private List<TipologiaEsame> tipologieEsame;

	public Clinica() {
		super();
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public List<Amministratore> getAmministratori() {
		return amministratori;
	}

	public void setAmministratori(List<Amministratore> amministratori) {
		this.amministratori = amministratori;
	}

	public List<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(List<Paziente> pazienti) {
		this.pazienti = pazienti;
	}

	public List<TipologiaEsame> getTipologieEsame() {
		return tipologieEsame;
	}

	public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
		this.tipologieEsame = tipologieEsame;
	}
	
	
}
