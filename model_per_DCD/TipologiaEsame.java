package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

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

	private Double prezzo;

	@OneToMany
	@JoinColumn(name = "tipologiaesame_id")
	private List<Prerequisito> prerequisiti;

	@OneToMany
	@JoinColumn(name = "tipologiaesame_id")
	private List<IndicatoreRisultato> indicatoriRisultato;

	public TipologiaEsame(){
		this.prerequisiti= new LinkedList<Prerequisito>();
		this.indicatoriRisultato= new LinkedList<IndicatoreRisultato>();
	}

	public TipologiaEsame(String nome, String descrizione, double prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.prerequisiti= new LinkedList<Prerequisito>();
		this.indicatoriRisultato= new LinkedList<IndicatoreRisultato>();
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + ((descrizione == null) ? 0 : descrizione.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((prezzo == null) ? 0 : prezzo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipologiaEsame other = (TipologiaEsame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (descrizione == null) {
			if (other.descrizione != null)
				return false;
		} else if (!descrizione.equals(other.descrizione))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (prezzo == null) {
			if (other.prezzo != null)
				return false;
		} else if (!prezzo.equals(other.prezzo))
			return false;
		return true;
	}
}