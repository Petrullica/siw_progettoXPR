package controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.Risultato;
import model.IndicatoreRisultato;
import model.Esame;
import facade.RisultatoFacade;

@ManagedBean
public class RisultatoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private IndicatoreRisultato indicatoreRisultato;
	private String valore;
	private Esame esame;
	private Risultato risultato;
	private List<Risultato> risultati;
	
	@EJB
	private RisultatoFacade risultatoFacade;
	
	public String creaRisultato(){
    	this.risultato= risultatoFacade.creaRisultato(indicatoreRisultato, valore, esame);
		return "risultato";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IndicatoreRisultato getIndicatoreRisultato() {
		return indicatoreRisultato;
	}

	public void setIndicatoreRisultato(IndicatoreRisultato indicatoreRisultato) {
		this.indicatoreRisultato = indicatoreRisultato;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public Risultato getRisultato() {
		return risultato;
	}

	public void setRisultato(Risultato risultato) {
		this.risultato = risultato;
	}

	public List<Risultato> getRisultati() {
		return risultati;
	}

	public void setRisultati(List<Risultato> risultati) {
		this.risultati = risultati;
	}
	
	
}
