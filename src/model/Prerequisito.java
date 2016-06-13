package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Prerequisito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	@Column(unique=true, nullable = false)
	private String nome;

	@Column(unique=true, nullable = false)
	private String valore;
	
	@ManyToMany(mappedBy = "indicatoriRisultato", cascade = {CascadeType.REFRESH, CascadeType.MERGE})
	private List<TipologiaEsame> tipologieEsame = new LinkedList<>();

	public Prerequisito() {
	}
	
	public Prerequisito(String nome, String valore) {
		this.nome = nome;
		this.valore = valore;
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

	public List<TipologiaEsame> getTipologieEsame() {
		return tipologieEsame;
	}

	public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
		this.tipologieEsame = tipologieEsame;
	}

	public Long getId() {
		return Id;
	}
}