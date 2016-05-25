package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import model.TipologiaEsame;

public class TipologiaEsameDao extends Dao<TipologiaEsame>{
	
	public TipologiaEsameDao(EntityManager em) {
		super(em);
	}
	
	public TipologiaEsame findByNome(String nome) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TipologiaEsame tipologiaEsame = em.find(TipologiaEsame.class, nome);
		tx.commit();
		em.close();
		return tipologiaEsame;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TipologiaEsame> findAll() {
		List<TipologiaEsame> tipologieEsame = em.createNamedQuery("TipologiaEsame.findAll").getResultList();
		return tipologieEsame;
	}
}