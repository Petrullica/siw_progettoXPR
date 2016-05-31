package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.PazienteDao;
import persistence.TipologiaEsameDao;



//da fare una Facade abstract e da farla estendere da questa classe pi�
//Facade Utente/Paziente ; Xu

public class Facade {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private Clinica clinica;
	private Esame esameCorrente;
	private Paziente pazienteCorrente;
	
	public Facade() {
		emf = Persistence.createEntityManagerFactory("clinica-unit");
		em = emf.createEntityManager();
		this.clinica = new Clinica();
	}
	
	
	//UC1 Utente consulta offerta
	public List<TipologiaEsame> consultaTipologieEsame(){
		return this.clinica.mostraTipologie();
	}
	
	public TipologiaEsame mostraDettagliTipologiaEsame(String nomeTipologiaEsame){
		return this.clinica.trovaTipologia(nomeTipologiaEsame);
	}
	
	
	//UC2 Amministratore crea esame
	public void creaNuovoEsame(String codice, Medico medico, Paziente paziente) {
		this.esameCorrente = new Esame(codice, medico, paziente);
	}
	
	public void impostaTipologiaEsame(String nome) {
		TipologiaEsame tipologia =  this.clinica.getTipologieEsami().get(nome);
		this.esameCorrente.setTipologia(tipologia);
	}
	
	public void associaPazienteAdEsame(Long codice) {
		Paziente paziente = this.clinica.getPazienti().get(codice);
		this.esameCorrente.setPaziente(paziente);
	}
	
	public void confermaInserimentoEsame() {
		Esame esameDaInserire=this.esameCorrente;
		this.clinica.getEsamiDaSvolgere().put(esameDaInserire.getCodice(),esameDaInserire);
	}
	
	
	//UC3 Paziente consulta risultati proprio esame
	public List<Esame> mostraElencoEsami(){
		return this.clinica.mostraEsamiDaSvolgere();
	}
    public Esame mostraDettaglioEsame(Long codiceEsame){
       return this.mostraDettaglioEsame(codiceEsame);   	
    }
	
    
	//UC4 Amministratore inserisce nuova tipologia esame
	public void creaNuovaTipologiaEsame(TipologiaEsame tipologia) {
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(em);
		tipologiaDao.save(tipologia);
		this.clinica.aggiungiTipologia(tipologia);
		//TODO
		//Da rivedere quando chiudere la entityManager, l'ho messa qua perch� volevo
		//solo vedere se mi salvava in database la tipologia
	}
	
	public void creaNuovoPaziente(Paziente paziente){
		PazienteDao pazienteDao = new PazienteDao(em);
		pazienteDao.save(paziente);
	}
	
	
	//UC5 Amministratore consulta esami effettuati da un medico
	public List<Esame> mostraEsamiMedico(String nome, String cognome) {
		String keyMedico = nome.concat(cognome);
		//TODO
		//DAO retrieve dal dbms
		return clinica.getMedici().get(keyMedico).getEsami();
	}
	
	
	//UC6 Amministratore inserisce risultati esame
	public Esame getEsameDaCompletare(Long codiceEsame){
		//TODO
		//DAO retrieve dal dbms
		Esame esameCorrente = this.clinica.getEsamiDaSvolgere().get(codiceEsame);
		return esameCorrente;
	}
	
	public void inserisciRisultatiEsame(){
		//TODO
	}
	
	
	
	// Getters&Setters
	public Clinica getClinica() {
		return clinica;
	}
	public Paziente getPazienteCorrente() {
		return pazienteCorrente;
	}
	public void setPazienteCorrente(Paziente pazienteCorrente) {
		this.pazienteCorrente = pazienteCorrente;
	}
	public Esame getEsameCorrente() {
		return esameCorrente;
	}
	public void setEsameCorrente(Esame esameCorrente) {
		this.esameCorrente = esameCorrente;
	}
}