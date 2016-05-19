package model;

import java.util.LinkedList;

public class AmministrazioneController {
	
	private Amministratore amministratoreCorrente;
	private Clinica clinica;
	private Esame esameCorrente;
	
	//UC4 Inserimento Nuova Tipologia Esame
	public void creaNuovaTipologiaEsame(String nome, String descr, double price)
	{
		TipologiaEsame nuovaTipologia = new TipologiaEsame(nome,descr,price);
		//TODO
		//DAO salvataggio in dbms
		this.clinica.aggiungiTipologia(nuovaTipologia);
	}
	
	
	//UC5 Esami effettuati da un Medico
	public LinkedList<Esame> mostraDatiMedico(String nome, String cognome) {
		String keyMedico = nome.concat(cognome);
		//TODO
		//DAO retrieve dal dbms
		return clinica.getMedici().get(keyMedico).getEsami();
	}
	
	//UC6 Inserimento risultati esame
	
	public Esame getEsameDaCompletare(Long codiceEsame){
		//TODO
		//DAO retrieve dal dbms
		Esame esameCorrente = this.clinica.getEsamiDaSvolgere().get(codiceEsame);
		return esameCorrente;
	}
	
	public void inserisciRisultatiEsame(){
		//TODO
	}
	

}
