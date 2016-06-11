package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class TerminaleClinica {
	
	@OneToOne
	private Amministratore amministratoreCorrente;
	
	@OneToOne
	private Paziente pazienteCorrente;
	
	@OneToOne
	private Clinica clinica;
	
	//UC 1
	public List<TipologiaEsame> getTipologieEsame(){return null;}
	public void registratiComePaziente(){}
	
	//UC2
	public void creaEsame(){}
	
	//UC3
	public List<Esame> getEsamiSvolti(){return null;}
	public List<Esame> getEsamiDaSvolgere(){return null;}
	
	//UC4
	public void inserisciTipologiaEsame(){}
	public void  annullaInserimentoEsame(){}
	
	//UC5
	public List<Esame> getEsamiMedico(){return null;}
	
	//UC6
	public void inserisciRisultatiEsame(){}
	
	public void loginPaziente(){}
	public void loginAmministratore(){}

}
