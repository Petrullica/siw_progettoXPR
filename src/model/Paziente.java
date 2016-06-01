package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Paziente {

	
	private String nome;
	
	private String cognome;
	
	@Id
	private String username;
	
	@Column(unique=true)
	private String password;
	
	@Column(unique=true, nullable = false)
	private String codiceFiscale;
	
	@OneToMany(mappedBy = "paziente")
	private List<Esame> esami;
	
	public Paziente() {
		this.esami= new LinkedList<Esame>();
	}

	public Paziente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		//Ho aggiunto questo codice fiscale calcolato a caso proprio
		this.codiceFiscale = nome.concat(cognome)+nome.hashCode();
		this.esami= new LinkedList<Esame>();
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return this.codiceFiscale;
	}
}