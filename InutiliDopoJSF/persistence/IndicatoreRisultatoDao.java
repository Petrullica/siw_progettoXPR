package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.IndicatoreRisultato;
import model.Risultato;
import model.TipologiaEsame;

public class IndicatoreRisultatoDao extends Dao<IndicatoreRisultato> {

	public IndicatoreRisultatoDao(EntityManager em) {
		super(em);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<IndicatoreRisultato> findAll() {
		List<IndicatoreRisultato> indicatoreRisultato = em.createNamedQuery("IndicatoreRisultato.findAll").getResultList();
		return indicatoreRisultato;
	}
	
	
	public IndicatoreRisultato findByNome(String nome) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query queryString=em.createQuery("SELECT * from IndicatoreRisultato  WHERE nome='"+nome+"';");
		IndicatoreRisultato indicatoreRisulatato= (IndicatoreRisultato)queryString.getSingleResult();
		tx.commit();
		em.close();
		return indicatoreRisulatato;
	}


	@Override
	public IndicatoreRisultato findByPrimaryKey(long id) {
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		IndicatoreRisultato indicatoreRisultato = em.find(IndicatoreRisultato.class, id);
		tx.commit();
		em.close();
		return indicatoreRisultato;
	}

}
