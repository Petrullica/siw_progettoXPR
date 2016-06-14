package controller;

import java.util.List;

import model.IndicatoreRisultato;
//import model.Prerequisito;
import model.TipologiaEsame;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import facade.TipologiaEsameFacade;

@ManagedBean
public class TipologiaEsameController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private Double prezzo;
	private String descrizione;
	private String prerequisito;
	private List<IndicatoreRisultato> indicatoriRisultato;
	private TipologiaEsame tipologiaEsame;
	private List<TipologiaEsame> tipologieEsame;

	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;

	@PostConstruct
	public void init(){
		this.tipologieEsame = tipologiaEsameFacade.getAllTipologieEsami();
	}

	public String creaTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.creaTipologiaEsame(nome, descrizione, prezzo, prerequisito);
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("tipologiaEsame", this.tipologiaEsame);
		return "tipologiaEsame"; 
	}

	public String mostraTipologieEsame() {
		this.tipologieEsame = tipologiaEsameFacade.getAllTipologieEsami();
		return "tipologieEsame"; 
	}

	public String findTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
	}

	public String findTipologiaEsame(Long id) {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
	}

	public String aggiornaIndicatore(){
		this.tipologiaEsame = (TipologiaEsame)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("tipologiaEsame");
		for (IndicatoreRisultato indicatoreRisultato : indicatoriRisultato) {
			tipologiaEsame.getIndicatoriRisultato().add(indicatoreRisultato);
			tipologiaEsameFacade.updateTipologiaEsame(tipologiaEsame);
		}
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("tipologiaEsame");
		return "tipologiaEsame";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getPrerequisito() {
		return prerequisito;
	}

	public void setPrerequisito(String prerequisito) {
		this.prerequisito = prerequisito;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<IndicatoreRisultato> getIndicatoriRisultato() {
		return indicatoriRisultato;
	}

	public void setIndicatoriRisultato(List<IndicatoreRisultato> indicatoriRisultato) {
		this.indicatoriRisultato = indicatoriRisultato;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public List<TipologiaEsame> getTipologieEsame() {
		return tipologieEsame;
	}

	public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
		this.tipologieEsame = tipologieEsame;
	}
}
