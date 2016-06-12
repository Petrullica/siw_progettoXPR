package facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

}
