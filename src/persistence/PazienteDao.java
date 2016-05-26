package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Paziente;
import model.Risultato;
import model.TipologiaEsame;

public class PazienteDao extends Dao<Paziente> {

	public PazienteDao(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paziente> findAll() {
		List<Paziente> paziente = em.createNamedQuery("Paziente.findAll").getResultList();
		return paziente;
	}
	
	public Paziente findByCodiceFiscale(String codiceFiscale) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from Paziente  WHERE codiceFiscale='"+codiceFiscale+"';");
		Paziente paziente= (Paziente)queryString.getSingleResult();
		tx.commit();
		em.close();
		return paziente;
	}


	@Override
	public Paziente findByPrimaryId(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Paziente paziente = em.find(Paziente.class, id);
		tx.commit();
		em.close();
		return paziente;
	}

}
