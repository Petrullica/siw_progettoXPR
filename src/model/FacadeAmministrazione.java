package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.TipologiaEsameDao;

//TODO
//da fare una Facade abstract e da farla estendere da questa classe più
//Facade Utente/Paziente ; Xu

public class FacadeAmministrazione {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public FacadeAmministrazione() {
		emf = Persistence.createEntityManagerFactory("clinica-unit");
		em = emf.createEntityManager();
	}
	
	public void inserisciTipologiaEsame(TipologiaEsame tipologia) {
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(em);
		tipologiaDao.save(tipologia);
		
		//TODO
		//Da rivedere quando chiudere la entityManager, l'ho messa qua perchè volevo
		//solo vedere se mi salvava in database la tipologia
		this.emf.close();
	}
}