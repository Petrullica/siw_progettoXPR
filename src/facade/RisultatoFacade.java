package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Risultato;
import model.Esame;
import model.IndicatoreRisultato;

@Stateless
public class RisultatoFacade {
	
	@PersistenceContext(unitName="clinica-unit")
    private EntityManager em;
	
	public Risultato creaRisultato(IndicatoreRisultato indicatoreRisultato, String valore, Esame esame) {
		Risultato risultato = new Risultato(indicatoreRisultato, valore, esame);
		em.persist(risultato);
		return risultato;
	}
	
	public List<Risultato> getAllRisultati() {
		CriteriaQuery<Risultato> cq = em.getCriteriaBuilder().createQuery(Risultato.class);
		cq.select(cq.from(Risultato.class));
		List<Risultato> risultati = em.createQuery(cq).getResultList();
		return risultati;
	}
	
	public Risultato getRisultato(Long id) {
		Risultato risultato = em.find(Risultato.class, id);
		return risultato;
	}
	
	public void updateRisultato(Risultato risultato) {
		em.merge(risultato);
	}
	
	public void deleteRisultato(Risultato risultato) {
		em.remove(risultato);
	}
	
	public void deleteRisultato(Long id) {
		Risultato risultato = em.find(Risultato.class, id);
		em.remove(risultato);
	}
}
