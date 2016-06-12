package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IndicatoreRisultato {

	@Id
	private String nome;

	public IndicatoreRisultato() {
	}

	public IndicatoreRisultato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}