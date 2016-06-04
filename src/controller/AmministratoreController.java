package controller;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import facade.AmministratoreFacade;
import model.Amministratore;

@ManagedBean
public class AmministratoreController {

	@ManagedProperty(value="#{param.username}")
	private String username;
	private String nome;
	private String password;
	private String cognome;
	private Amministratore amministratore;
	private List<Amministratore> amministratori;

	@EJB
	private AmministratoreFacade amministratoreFacade;

	public String loginAmministratore(){
		Amministratore amministratore = amministratoreFacade.getAmministratore(username);
		if(amministratore!=null && amministratore.getPassword().equals(password)){
			this.amministratore = amministratore;
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("amministratore", this.amministratore);
			return "autenticatoAmministratore";
		}
		else return "fallimento";
	}

	public String creaAmministratore() {
		this.amministratore = amministratoreFacade.creaAmministratore(nome, cognome, username, password);
		return "amministratore"; 
	}

	public String mostraAmministratori() {
		this.amministratori = amministratoreFacade.getAllAmministratori();
		return "amministratori"; 
	}

	public String findAmministratore() {
		this.amministratore = amministratoreFacade.getAmministratore(username);
		return "amministratore";
	}

	public String findAmministratore(String username) {
		this.amministratore = amministratoreFacade.getAmministratore(username);
		return "amministratore";

	}
}

