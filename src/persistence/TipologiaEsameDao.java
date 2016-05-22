package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import model.TipologiaEsame;

public class TipologiaEsameDao extends Dao<TipologiaEsame>{
	
	public TipologiaEsameDao(EntityManagerFactory emf) {
		super(emf);
	}
	
	@Override
	public TipologiaEsame findById(long id) {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TipologiaEsame a = em.find(TipologiaEsame.class, id);
		tx.commit();
		em.close();
		return a;
	}

	@Override
	public List<TipologiaEsame> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

