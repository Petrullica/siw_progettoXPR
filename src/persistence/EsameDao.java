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
	public Esame findByPrimaryKey(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Esame esame = em.find(Esame.class, id);
		tx.commit();
		em.close();
		return esame;
	}

	public List<Esame> finByPaziente(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Esame> finByMedico(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Esame> findByEsameSvolto() {
		// TODO Auto-generated method stub 
		// xu consiglia un "Check if dataSvolgimentoEsame != null
		return null;
	}
	
	public List<Esame> findByEsameDaSvolgere() {
		// TODO Auto-generated method stub 
		// xu consiglia un "Check if dataSvolgimentoEsame == null
		return null;
	}
}