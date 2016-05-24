package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public abstract class Dao<T> {
	public EntityManager em;

	public Dao(EntityManager em) {
		this.em = em;
	}

	public void save(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(entity);
		tx.commit();
		em.close();
	}

	public void update(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(entity);
		tx.commit();
		em.close();
	}

	public void delete(T entity) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		T toRemove = em.merge(entity);
		em.remove(toRemove);
		tx.commit();
		em.close();
	}

	public void close() {
		em.close();
	}
	
	public abstract T findById(long id);
	public abstract List<T> findAll();
}
