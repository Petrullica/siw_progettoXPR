package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Esame;
import model.Risultato;
import model.TipologiaEsame;

public class EsameDao extends Dao<Esame> {

	public EsameDao(EntityManager em) {
		super(em);
	} 

	@SuppressWarnings("unchecked")
	@Override
	public List<Esame> findAll() {
		List<Esame> esame = em.createNamedQuery("Esame.findAll").getResultList();
		return esame;
	}

	public Esame findByCodice(String codice) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from Esame  WHERE codice='"+codice+"';");
		Esame esame= (Esame)queryString.getSingleResult();
		tx.commit();
		em.close();
		return esame;
	}

	
	@Override
	public Esame findByPrimaryId(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Esame esame = em.find(Esame.class, id);
		tx.commit();
		em.close();
		return esame;
	}

}
