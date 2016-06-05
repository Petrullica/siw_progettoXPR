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
		this.esami = new LinkedList<Esame>();
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
	public String toString() {
		return "Medico [nome=" + nome + ", cognome=" + cognome + "]";
	}
}