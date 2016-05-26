package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Risultato;
import model.TipologiaEsame;

//manca il retrive per la chiave
public class RisultatoDao extends Dao<Risultato> {

	public RisultatoDao(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Risultato> findAll() {
		List<Risultato> risultato = em.createNamedQuery("Risultato.findAll").getResultList();
		return risultato;
	} 
	
 

	@Override
	public Risultato findByPrimaryId(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Risultato risultato = em.find(Risultato.class, id);
		tx.commit();
		em.close();
		return risultato;
	}

}
