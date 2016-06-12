package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medico {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;	
	private String cognome;	
	private String specializzaione;

	@OneToMany(mappedBy = "medico")
	private List<Esame> esami;

	public Medico(){
		this.esami= new LinkedList<Esame>();
	}

	public Medico(String nome, String cognome, String specializzazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.specializzaione = specializzazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public Long getId() {
		return id;
	}

	public String getSpecializzaione() {
		return specializzaione;
	}

	public void setSpecializzaione(String specializzaione) {
		this.specializzaione = specializzaione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((specializzaione == null) ? 0 : specializzaione.hashCode());
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
		Medico other = (Medico) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
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
		if (specializzaione == null) {
			if (other.specializzaione != null)
				return false;
		} else if (!specializzaione.equals(other.specializzaione))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", cognome=" + cognome + "]";
	}
}