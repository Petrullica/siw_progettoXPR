package model;

import java.util.LinkedList;
import java.util.List;

public class Medico {
	private Long id;
	private String nome;
	private String cognome;
	private LinkedList<Esame> esami;

	public Medico(){
	}

	public Medico(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
		this.esami = new LinkedList<>();
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

	public LinkedList<Esame> getEsami() {
		return esami;
	}

	public void setEsami(LinkedList<Esame> linkedList) {
		this.esami = linkedList;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", cognome=" + cognome + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}