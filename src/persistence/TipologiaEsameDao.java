package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Amministratore;
import model.TipologiaEsame;

public class TipologiaEsameDao extends Dao<TipologiaEsame>{
	
	public TipologiaEsameDao(EntityManager em) {
		super(em);
	}
	
	public TipologiaEsame findByNome(String nome) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from TipologiaEsame  WHERE nome='"+nome+"';");
		TipologiaEsame tipologiaEsame= (TipologiaEsame)queryString.getSingleResult();
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

	@Override
	public TipologiaEsame findByPrimaryId(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		TipologiaEsame tipologiaEsame = em.find(TipologiaEsame.class, id);
		tx.commit();
		em.close();
		return tipologiaEsame;
	}
}