package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prerequisito {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	@Column(unique=true, nullable = false)
	private String nome;

	@Column(unique=true, nullable = false)
	private String valore;

	public Prerequisito() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public Long getId() {
		return Id;
	}
}