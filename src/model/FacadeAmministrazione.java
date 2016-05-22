package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import persistence.TipologiaEsameDao;

//TODO
//da fare una Facade abstract e da farla estendere da questa classe più
//Facade Utente/Paziente ; Xu

public class FacadeAmministrazione {
	
	private EntityManagerFactory emf;
	
	public FacadeAmministrazione()
	{
		this.emf = Persistence.createEntityManagerFactory("clinica-unit");
	}
	
	public void inserisciTipologiaEsame(TipologiaEsame tipologia)
	{
		TipologiaEsameDao tipologiaDao = new TipologiaEsameDao(emf);
		tipologiaDao.save(tipologia);
		
		//TODO
		//Da rivedere quando chiudere la entityManager, l'ho messa qua perchè volevo
		//solo vedere se mi salvava in database la tipologia
		this.emf.close();
	}

}
