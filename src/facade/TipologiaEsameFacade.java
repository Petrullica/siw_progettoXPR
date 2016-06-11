package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.IndicatoreRisultato;
import model.TipologiaEsame;

@Stateless
public class TipologiaEsameFacade {
	
    @PersistenceContext(unitName="clinica-unit")
    private EntityManager em;
    
	public TipologiaEsame creaTipologiaEsame(String nome, String descrizione, Double prezzo, List<IndicatoreRisultato> indicatoriRisultato) {
		TipologiaEsame tipologiaEsame = new TipologiaEsame(nome, descrizione, prezzo, indicatoriRisultato);
		em.persist(tipologiaEsame);
		return tipologiaEsame;
	}
	
	public TipologiaEsame getTipologiaEsame(Long id) {
	    TipologiaEsame tipologiaEsame = em.find(TipologiaEsame.class, id);
		return tipologiaEsame;
	}
	
	public List<TipologiaEsame> getAllTipologieEsami() {
        CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
        cq.select(cq.from(TipologiaEsame.class));
        List<TipologiaEsame> tipologieEsami = em.createQuery(cq).getResultList();
		return tipologieEsami;
	}

	public void updateTipologiaEsame(TipologiaEsame tipologiaEsame) {
        em.merge(tipologiaEsame);
	}
	
    private void deleteTipologiaEsame(TipologiaEsame tipologiaEsame) {
        em.remove(tipologiaEsame);
    }

	public void deleteTipologiaEsame(Long id) {
		TipologiaEsame tipologiaEsame = em.find(TipologiaEsame.class, id);
        deleteTipologiaEsame(tipologiaEsame);
	}
}

