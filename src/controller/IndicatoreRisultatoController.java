package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import facade.IndicatoreRisultatoFacade;
import model.IndicatoreRisultato;

@ManagedBean
public class IndicatoreRisultatoController {

	@ManagedProperty(value="#{param.nome}")
	private String nome;
	private IndicatoreRisultato indicatoreRisultato;
	private List<IndicatoreRisultato> indicatoriRisultato;

	@EJB
	private IndicatoreRisultatoFacade indicatoreRisultatoFacade;

	@PostConstruct
	public void init(){
		this.indicatoriRisultato = indicatoreRisultatoFacade.getAllIndicatoriRisultato();
	}

	public String creaIndicatoreRisultato() {
		this.indicatoreRisultato = indicatoreRisultatoFacade.creaIndicatoreRisultato(nome);
		return "indicatoreRisultato"; 
	}

	public String mostraIndicatoriRisultato() {
		this.indicatoriRisultato = indicatoreRisultatoFacade.getAllIndicatoriRisultato();
		return "indicatoriRisultato"; 
	}

	public String findIndicatoreRisultato(String nome) {
		this.indicatoreRisultato = indicatoreRisultatoFacade.getIndicatoreRisultato(nome);
		return "indicatoreRisultato";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public IndicatoreRisultato getIndicatoreRisultato() {
		return indicatoreRisultato;
	}

	public void setIndicatoreRisultato(IndicatoreRisultato indicatoreRisultato) {
		this.indicatoreRisultato = indicatoreRisultato;
	}

	public List<IndicatoreRisultato> getIndicatoriRisultato() {
		return indicatoriRisultato;
	}

	public void setIndicatoriRisultato(List<IndicatoreRisultato> indicatoriRisultato) {
		this.indicatoriRisultato = indicatoriRisultato;
	}
}