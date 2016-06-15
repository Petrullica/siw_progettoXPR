package controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import facade.EsameFacade;
import model.Esame;
import model.Medico;
import model.Paziente;
import model.Risultato;
import model.TipologiaEsame;

@ManagedBean
public class EsameController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String codice;
	private Medico medico;
	private List<Risultato> risultati;
	private TipologiaEsame tipologiaEsame;
	private Date dataPrenotazioneEsame;
	private Date dataSvolgimentoEsame;
	private Paziente paziente;
	private Esame esame;
	private List<Esame> esami;
	
	@EJB
	private EsameFacade esameFacade;
	
	@PostConstruct
	public void init(){
		this.esami = esameFacade.getAllEsami();
	}
	
	public String creaEsame(){
    	this.esame= esameFacade.creaEsame(codice,dataSvolgimentoEsame, paziente, medico, tipologiaEsame);
		return "esame";    	
    }
	
	public String mostraEsami(){
		this.esami= esameFacade.getAllEsami();
		return "esami";
	}
	
	
	public String mostraEsamiPaziente(){
		this.paziente= (Paziente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("paziente");
		if(paziente!=null){
		this.esami= esameFacade.getEsamiByPazienteUsername(paziente.getUsername());
		return "esami";
		}
		else return "fallimento";
	}
	
	public String mostraEsamiPrenotatiPaziente(){
		this.paziente= (Paziente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("paziente");
		if(paziente!=null){
		this.esami= esameFacade.getEsamiPrenotatiByPazienteUsername(paziente.getUsername());
		return "esami";
		}
		else return "fallimento";
	}
		
	public String mostraEsamiEffettuatiPaziente(){
			this.paziente= (Paziente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("paziente");
			if(paziente!=null){
			this.esami= esameFacade.getEsamiEffettuatiByPazienteUsername(paziente.getUsername());
			return "esami";
			}
			else return "fallimento";
	}	
	
	public String findEsame(){
		if(this.esame!=null){
			return "esameDaCompletare";
		}
		return "error";
	}
	
    public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Risultato> getRisultati() {
		return risultati;
	}

	public void setRisultati(List<Risultato> risultati) {
		this.risultati = risultati;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}
	
	

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Date getDataPrenotazioneEsame() {
		return dataPrenotazioneEsame;
	}

	public void setDataPrenotazioneEsame(Date dataPrenotazioneEsame) {
		this.dataPrenotazioneEsame = dataPrenotazioneEsame;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataSvolgimentoEsame() {
		return dataSvolgimentoEsame;
	}

	public void setDataSvolgimentoEsame(Date dataSvolgimentoEsame) {
		this.dataSvolgimentoEsame = dataSvolgimentoEsame;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}
	
	
}
