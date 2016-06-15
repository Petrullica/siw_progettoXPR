package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prerequisito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String valore;
	
	@ManyToOne
	private TipologiaEsame tipologia;
	
	

	public Prerequisito() {
	}
	
	public Prerequisito(String nome, String valore, TipologiaEsame tipologia) {
		this.nome = nome;
		this.valore = valore;
		this.tipologia = tipologia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public Long getId() {
		return Id;
	}

	public TipologiaEsame getTipologia() {
		return tipologia;
	}

	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}
	
	
}