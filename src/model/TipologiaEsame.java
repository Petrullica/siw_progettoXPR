package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
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
	
	@Column(unique=true)
	private String codice;
	
	@Column(unique=true, nullable = false)
	private String nome;
	
	@Column(unique=true, nullable = false)
	private String descrizione;
	
	private double costo;
	
	@OneToMany
	private List<Prerequisito> prerequisiti;
	
	@OneToMany
	private List<IndicatoreRisultato> indicatoriRisultato;
	
	public TipologiaEsame(){
		this.prerequisiti= new LinkedList<Prerequisito>();
		this.indicatoriRisultato= new LinkedList<IndicatoreRisultato>();
	}
	
	public TipologiaEsame(String nome, String descrizione, double costo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.prerequisiti= new LinkedList<Prerequisito>();
		this.indicatoriRisultato= new LinkedList<IndicatoreRisultato>();
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