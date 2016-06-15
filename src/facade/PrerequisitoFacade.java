package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Prerequisito;
import model.TipologiaEsame;

@Stateless
public class PrerequisitoFacade {
	
	@PersistenceContext(unitName="clinica-unit")
	private EntityManager em;
	
	public Prerequisito creaPrerequisito(String nome, String valore, TipologiaEsame tipologia) {
		Prerequisito prerequisito = new Prerequisito(nome, valore, tipologia);
		em.persist(prerequisito);
		return prerequisito;
	}
	
	public List<Prerequisito> getAllPrerequisiti() {
		CriteriaQuery<Prerequisito> cq = em.getCriteriaBuilder().createQuery(Prerequisito.class);
		cq.select(cq.from(Prerequisito.class));
		List<Prerequisito> prerequisiti = em.createQuery(cq).getResultList();
		return prerequisiti;
	}
	
	public Prerequisito getPrerequisito(Long id) {
		Prerequisito prerequisito = em.find(Prerequisito.class, id);
		return prerequisito;
	}
	
	public void updatePrerequisito(Prerequisito prerequisito) {
		em.merge(prerequisito);
	}
	
	public void deletePrerequisito(Prerequisito prerequisito) {
		em.remove(prerequisito);
	}
	
	public void deletePrerequisito(Long id) {
		Prerequisito prerequisito = em.find(Prerequisito.class, id);
		em.remove(prerequisito);
	}
}