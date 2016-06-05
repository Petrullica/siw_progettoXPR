package controller;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import facade.EsameFacade;
import model.Esame;


@ManagedBean
public class EsameController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String codice;
	private String nome;
	private Esame esame;
	private Date dataPrenotazioneEsame;
	private Date dataSvolgimentoEsame;
	private List<Esame> esami;
	
	@EJB
	private EsameFacade esameFacade;
	
	public String creaEsame(){
    	this.esame= esameFacade.creaEsame(codice, nome);
		return "esame";
    	
    }
	
	public String mostraEsami(){
		this.esami= esameFacade.getAllEsami();
		return "esami";
	}
	
	public String findEsame() {
		this.esame = esameFacade.getEsame(id);
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
