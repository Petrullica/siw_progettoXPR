package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Risultato {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToOne
	private IndicatoreRisultato indicatoreRisultato;

	@Column(nullable = false)
	private String valore;

	@ManyToOne
	private Esame esame;

	public Risultato() {
	}
	
	public Risultato(IndicatoreRisultato indicatoreRisultato, String valore, Esame esame) {
		this.indicatoreRisultato = indicatoreRisultato;
		this.valore = valore;
		this.esame = esame;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public Long getId() {
		return id;
	}
}