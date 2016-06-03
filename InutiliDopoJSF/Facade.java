package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.*;


//da fare una Facade abstract e da farla estendere da questa classe pi�
//Facade Utente/Paziente ; Xu

public class Facade {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public Facade() {
		emf = Persistence.createEntityManagerFactory("clinica-unit");
		em = emf.createEntityManager();
	}
	
	//UC0a Paziente effettua login
	public Paziente loginPaziente(String username, String password){
		PazienteDao pazientedao = new PazienteDao(em);
		Paziente paziente = pazientedao.findByUsername(username);
		if(password.equals(paziente.getPassword()))	return paziente;
		else return null;
	}
	
	//UC0b Amministratore effettua login
	public Amministratore loginAmministratore(String username, String password){
		AmministratoreDao amministratoreDao = new AmministratoreDao(em);
		Amministratore amministratore = amministratoreDao.findByUsername(username);
		if(password.equals(amministratore.getPassword())) return amministratore;
		else return null;
	}
	
	//UC1 Utente consulta offerta
	public List<TipologiaEsame> consultaTipologieEsame(){
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(em);
		return tipologiaDao.findAll();
	}

	public TipologiaEsame mostraDettaglioTipologiaEsame(long idTipologiaEsame){
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(em);
		return tipologiaDao.findByPrimaryKey(idTipologiaEsame);
	}
	
	
	//UC2 Amministratore crea esame
	public void creaNuovoEsame(Esame esame) {
		EsameDao esameDao = new EsameDao(em);
		esameDao.save(esame);
	}
	
	
	/*
	 * tutti questi metodi secondo me sono inutili
	 * queste azioni vengono fatte direttamente nella pagina jsp
	 * durante la creazione del nuovo esame
	 * author: petrullica
	public void impostaTipologiaEsame(String nome) {}
	public void associaPazienteAdEsame(Long codice) {}
	public void confermaInserimentoEsame() {}
	*/
	
	
	//UC3 Paziente consulta risultati proprio esame
	
	/*
	 * da fare il metodo findByPaziente
	 * author: petrullica
	 */
	public List<Esame> mostraElencoEsami(Long idPaziente){
		EsameDao esameDao = new EsameDao(em);
		return esameDao.finByPaziente(idPaziente);
	}
	
	// valido anche per UC6
    public Esame mostraDettaglioEsame(Long idEsame){
    	EsameDao esameDao = new EsameDao(em);
    	return esameDao.findByPrimaryKey(idEsame);
    }
	
    
	//UC4 Amministratore inserisce nuova tipologia esame
	public void creaNuovaTipologiaEsame(TipologiaEsame tipologia) {
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(em);
		tipologiaDao.save(tipologia);
	}
	
	public void creaNuovoPaziente(Paziente paziente){
		PazienteDao pazienteDao = new PazienteDao(em);
		pazienteDao.save(paziente);
	}
	
	
	//UC5 Amministratore consulta esami effettuati da un medico
	
	/*
	 * da fare il metodo findByMedico
	 * author: petrullica
	 */
	public List<Esame> mostraEsamiMedico(long idMedico) {
		EsameDao esameDao = new EsameDao(em);
		return esameDao.finByMedico(idMedico);
	}
	
	
	//UC6 Amministratore inserisce risultati esame
	
	/*
	 * da fare il metodo findByEsameDaSvolgere\Svolto
	 * author: petrullica
	 */
	public List<Esame> mostraEsamiDaSvolgere() {
		EsameDao esameDao = new EsameDao(em);
		return esameDao.findByEsameDaSvolgere();
	}
	
	//  gia scritto sopra public Esame mostraDettaglioEsame(Long idEsame){
	
	/*
	 * da fare il metodo findByEsame
	 * author: petrullica
	 */
	public List<Risultato> mostraElencoRisultati(Long idEsame) {
		RisultatoDao risultatoDao = new RisultatoDao(em);
		return risultatoDao.findByEsame(idEsame);
	}
	
	public Risultato mostraDettaglioRisultato(Long idRisultato) {
		RisultatoDao risultatoDao = new RisultatoDao(em);
		return risultatoDao.findByPrimaryKey(idRisultato);
	}
	
	/*
	 * i dettagli dell'esame vengono inseriti direttamente nella pagina jsp
	 * author: petrullica
	 */
	public void aggiornaRisultatoEsame(Risultato risultato){
		RisultatoDao risultatoDao = new RisultatoDao(em);
		risultatoDao.update(risultato);
	}
}