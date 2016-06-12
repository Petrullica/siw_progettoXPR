package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Amministratore {

	@Id
	private String username;

	private String nome;

	private String cognome;

	@Column(nullable = false)
	private String password;

	public Amministratore() {
	}

	public Amministratore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public Amministratore(String username, String nome, String cognome, String password) {
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}