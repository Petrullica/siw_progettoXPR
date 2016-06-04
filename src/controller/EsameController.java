package controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import facade.EsameFacade;
import model.Esame;
import model.TipologiaEsame;


//DA SISTEMARE LA RISPETTIVA FACADE

@SessionScoped
@ManagedBean
public class EsameController {
	//
	@ManagedProperty(value="#{param.id}")
	private String codice;
	private String nome;
	private Esame esame;
	private Date dataPrenotazioneEsame;
	private Date dataSvolgimentoEsame;
	
	@EJB
	
	private EsameFacade esameFacade;
	
	public String creaEsame(){
    	this.esame= esameFacade.creaEsame(codice, nome, dataPrenotazioneEsame,dataSvolgimentoEsame);
		return "esame";
    	
    }
	
	public String mostraEsami(){
		this.esame= esameFacade.getAllEsami();
		return "esame";
	}
	
	public String findEsame() {
		this.esame = esameFacade.getPaziente(this.codice);
		return "esame";
	}
	
    public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public Date getDataPrenotazioneEsame() {
		return dataPrenotazioneEsame;
	}

	public void setDataPrenotazioneEsame(Date dataPrenotazioneEsame) {
		this.dataPrenotazioneEsame = dataPrenotazioneEsame;
	}

	public EsameFacade getEsameFacade() {
		return esameFacade;
	}

	public void setEsameFacade(EsameFacade esameFacade) {
		this.esameFacade = esameFacade;
	}

}
