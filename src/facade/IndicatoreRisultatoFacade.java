package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.IndicatoreRisultato;

@Stateless
public class IndicatoreRisultatoFacade {

	@PersistenceContext(unitName="clinica-unit")
	private EntityManager em;

	public IndicatoreRisultato creaIndicatoreRisultato(String nome) {
		IndicatoreRisultato indicatoreRisultato = new IndicatoreRisultato(nome);
		em.persist(indicatoreRisultato);
		return indicatoreRisultato;
	}

	public List<IndicatoreRisultato> getAllIndicatoriRisultato() {
		CriteriaQuery<IndicatoreRisultato> cq = em.getCriteriaBuilder().createQuery(IndicatoreRisultato.class);
		cq.select(cq.from(IndicatoreRisultato.class));
		List<IndicatoreRisultato> indicatoriRisultato = em.createQuery(cq).getResultList();
		return indicatoriRisultato;
	}

	public IndicatoreRisultato getIndicatoreRisultato(String nome) {
		IndicatoreRisultato indicatoreRisultato = em.find(IndicatoreRisultato.class, nome);
		return indicatoreRisultato;
	}

	public void updateIndicatoreRisultato (IndicatoreRisultato indicatoreRisultato) {
		em.merge(indicatoreRisultato);
	}

	public void deleteIndicatoreRisultato(IndicatoreRisultato indicatoreRisultato) {
		em.remove(indicatoreRisultato);
	}

	public void deleteIndicatoreRisultato(String nome) {
		IndicatoreRisultato indicatoreRisultato = em.find(IndicatoreRisultato.class, nome);
		deleteIndicatoreRisultato(indicatoreRisultato);
	}
}