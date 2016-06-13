package controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import facade.PrerequisitoFacade;
import model.Prerequisito;
import model.TipologiaEsame;

@ManagedBean
public class PrerequisitoController {

	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private String valore;
	private Prerequisito prerequisito;
	private TipologiaEsame tipologiaEsame;
	private Prerequisito prerequisitoSelezionato;
	private List<Prerequisito> prerequisitiSelezionati;
	private List<Prerequisito> prerequisiti;

	@EJB
	private PrerequisitoFacade prerequisitoFacade;

	@PostConstruct
	public void init() {
		this.prerequisiti = prerequisitoFacade.getAllPrerequisiti();
	}

	public String creaPrerequisito() {
		this.prerequisito = prerequisitoFacade.creaPrerequisito(nome, valore);
		return "prerequisito";
	}

	public String mostraPrerequisiti() {
		this.prerequisiti = prerequisitoFacade.getAllPrerequisiti();
		return "";
	}

	public String findPrerequisito() {
		this.prerequisito = prerequisitoFacade.getPrerequisito(id);
		return "prerequisito";
	}

	public String findPrerequisito(Long id) {
		this.prerequisito = prerequisitoFacade.getPrerequisito(id);
		return "prerequisito";
	}

	public String aggiornaChiave(){
		this.tipologiaEsame = (TipologiaEsame)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("tipologiaEsame");
		if(prerequisitiSelezionati!=null){
			for (Prerequisito prerequisito : prerequisitiSelezionati) {
				prerequisito.getTipologieEsame().add(tipologiaEsame);
				this.prerequisitoFacade.updatePrerequisito(prerequisito);	
			}
			return "confermaTipologiaEsame";
		}
		else return "error";
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

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}

	public Prerequisito getPrerequisito() {
		return prerequisito;
	}

	public void setPrerequisito(Prerequisito prerequisito) {
		this.prerequisito = prerequisito;
	}

	public List<Prerequisito> getPrerequisiti() {
		return prerequisiti;
	}

	public void setPrerequisiti(List<Prerequisito> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public Prerequisito getPrerequisitoSelezionato() {
		return prerequisitoSelezionato;
	}

	public void setPrerequisitoSelezionato(Prerequisito prerequisitoSelezionato) {
		this.prerequisitoSelezionato = prerequisitoSelezionato;
	}

	public List<Prerequisito> getPrerequisitiSelezionati() {
		return prerequisitiSelezionati;
	}

	public void setPrerequisitiSelezionati(List<Prerequisito> prerequisitiSelezionati) {
		this.prerequisitiSelezionati = prerequisitiSelezionati;
	}



}