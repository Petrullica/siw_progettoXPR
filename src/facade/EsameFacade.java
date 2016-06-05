package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Esame;


//Il costruttore tocca passargli solo codice e nome se
//La creazione della data è stata fatta bene...

@Stateless
public class EsameFacade {

	@PersistenceContext(unitName="clinica-unit")
    private EntityManager em;
 
	
	public Esame creaEsame(String codice, String nome) {
		Esame esame = new Esame(codice, nome);
		em.persist(esame);
		return esame;
	}
	
	public Esame getEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
		return esame;
	}
	
	public List<Esame> getAllEsami() {
        CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
        cq.select(cq.from(Esame.class));
        List<Esame> esami = em.createQuery(cq).getResultList();
		return esami;
	}

	public void updateEsame(Esame esame) {
        em.merge(esame);
	}
	
    private void deleteEsame(Esame esame) {
        em.remove(esame);
    }

	public void deleteEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
        deleteEsame(esame);
	}
}


