package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Medico;
import model.Paziente;
import model.Risultato;
import model.TipologiaEsame;

public class MedicoDao extends Dao<Medico> {

	public MedicoDao(EntityManager em) {
		super(em);
	}
 
	@SuppressWarnings("unchecked")
	@Override
	public List<Medico> findAll() {
		List<Medico> medico = em.createNamedQuery("Medico.findAll").getResultList();
		return medico;
	}

	public Medico findByCodiceFiscale(String codiceFiscale) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from Medico  WHERE codiceFiscale='"+codiceFiscale+"';");
		Medico medico= (Medico)queryString.getSingleResult();
		tx.commit();
		em.close();
		return medico;
	}

	@Override
	public Medico findByPrimaryKey(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Medico medico = em.find(Medico.class, id);
		tx.commit();
		em.close();
		return medico;
	}

}
