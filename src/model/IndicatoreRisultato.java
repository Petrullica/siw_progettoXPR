package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="indicatore")
public class IndicatoreRisultato {

	@Id
	@Column(name="indicatore_nome")
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