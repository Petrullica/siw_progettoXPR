package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Paziente {

	@Id
	private String username;
	
	private String nome;
	
	private String cognome;
	
	
	@Column(unique=true)
	private String password;
	
	@Column(unique=true, nullable = false)
	private String codiceFiscale;
	
	@OneToMany(mappedBy = "paziente")
	private List<Esame> esami;
	
	public Paziente() {
		this.esami= new LinkedList<Esame>();
	}

	public Paziente(String nome, String cognome, String username,String password) {
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password =password;
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