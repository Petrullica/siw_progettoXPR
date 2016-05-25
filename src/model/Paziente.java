package model;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Paziente {

	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private String codiceFiscale;
	
	@OneToMany
	@JoinColumn(name = "paziente_id")
	@OrderBy("creationtime asc")
	private List<Esame> esami;

	public Paziente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}
}