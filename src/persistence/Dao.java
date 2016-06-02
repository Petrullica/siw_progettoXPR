package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import model.TipologiaEsame;

//dubbio quando va chiuso l'em??
public abstract class Dao<T> {
	public EntityManager em;

	public Dao(EntityManager em) {
		this.em = em;
	}
	
	//Create
	public void save(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(entity);
		tx.commit();
	}

	//Retrieve
	public abstract List<T> findAll();
	public abstract T findByPrimaryKey(long id);
	
	//Update
	public void update(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(entity);
		tx.commit();
	}

	//Delete
	public void delete(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T toRemove = em.merge(entity);
		em.remove(toRemove);
		tx.commit();
	}
}