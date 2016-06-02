package controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import facade.EsameFacade;
import model.Esame;
import model.TipologiaEsame;

@SessionScoped
@ManagedBean
public class EsameController {
	
	@ManagedProperty(value="#{param.id}")
	private String codice;
	private String nome;
	private Esame esame;
	private Date dataPrenotazioneEsame;
	private TipologiaEsame tipologiaEsame;
	
	@EJB
	
	private EsameFacade esameFacade;
	
    public String creaEsame(){
    	this.esame= esameFacade.creaEsame(codice, nome, dataPrenotazioneEsame, tipologiaEsame);
		return "esame";
    	
    }
}
