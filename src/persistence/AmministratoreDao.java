package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Amministratore;
import model.Risultato;
import model.TipologiaEsame;

public class AmministratoreDao extends Dao<Amministratore> {

	public AmministratoreDao(EntityManager em) {
		super(em);
	}
 
	@SuppressWarnings("unchecked")
	@Override
	public List<Amministratore> findAll() {
		List<Amministratore> amministratore = em.createNamedQuery("Amministratore.findAll").getResultList();
		return amministratore;
	}
	
	public Amministratore findByUsername(String username) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from Amministratore  WHERE username='"+username+"';");
		Amministratore amministratore= (Amministratore)queryString.getSingleResult();
		tx.commit();
		em.close();
		return amministratore;
	}


	@Override
	public Amministratore findByPrimaryId(long id) {
			
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			Amministratore amministratore = em.find(Amministratore.class, id);
			tx.commit();
			em.close();
			return amministratore;

	}

}
