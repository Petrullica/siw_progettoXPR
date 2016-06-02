package controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import facade.PazienteFacade;
import model.Paziente;

@SessionScoped
@ManagedBean
public class PazienteController {
	
	@ManagedProperty(value="#{param.id}")
	private String username;
	private String nome;
	private String password;
	private String cognome;
	private Paziente paziente;
	private List<Paziente> pazienti;
	
	@EJB
	private PazienteFacade pazienteFacade;
	
	public String loginPaziente(){
		Paziente paziente = pazienteFacade.getPaziente(username);
		if(paziente!=null && paziente.getPassword().equals(password)){
				this.paziente = paziente;
				return "autenticatoPaziente";
		}
		else return "fallimento";
	}
	
	public String creaPaziente() {
		this.paziente = pazienteFacade.creaPaziente(nome, cognome, username, password);
		return "paziente"; 
	}
	
	public String mostraPazienti() {
		this.pazienti = pazienteFacade.getAllPazienti();
		return "pazienti"; 
	}

	public String findPaziente() {
		this.paziente = pazienteFacade.getPaziente(username);
		return "paziente";
	}
	
	public String findTipologiaEsame(String username) {
		this.paziente = pazienteFacade.getPaziente(username);
		return "paziente";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public List<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(List<Paziente> pazienti) {
		this.pazienti = pazienti;
	}
	
	
}
