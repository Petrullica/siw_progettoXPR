package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Prerequisito;
import model.Risultato;
import model.TipologiaEsame;

public class PrerequisitiDao extends Dao<Prerequisito> {

	public PrerequisitiDao(EntityManager em) {
		super(em);
	}
	
	public Prerequisito findByNome(String nome) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from Prerequisito  WHERE nome='"+nome+"';");
		Prerequisito prerequisito= (Prerequisito)queryString.getSingleResult();
		tx.commit();
		em.close();
		return prerequisito;
	}

 
	@SuppressWarnings("unchecked")
	@Override
	public List<Prerequisito> findAll() {
		List<Prerequisito> prerequisito = em.createNamedQuery("Prerequisito.findAll").getResultList();
		return prerequisito;
	}

	@Override
	public Prerequisito findByPrimaryKey(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Prerequisito prerequisito = em.find(Prerequisito.class, id);
		tx.commit();
		em.close();
		return prerequisito;
	}



}
