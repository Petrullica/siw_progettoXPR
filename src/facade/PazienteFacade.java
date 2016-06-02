package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Paziente;

@Stateless
public class PazienteFacade {

	 @PersistenceContext(unitName="clinica-unit")
	    private EntityManager em;
	 
		public Paziente creaPaziente(String nome, String cognome, String username, String password) {
			Paziente paziente = new Paziente(nome, cognome, username, password);
			em.persist(paziente);
			return paziente;
		}
		
		public Paziente getPaziente(String username) {
		    Paziente paziente = em.find(Paziente.class, username);
			return paziente;
		}
		
		public List<Paziente> getAllPazienti() {
	        CriteriaQuery<Paziente> cq = em.getCriteriaBuilder().createQuery(Paziente.class);
	        cq.select(cq.from(Paziente.class));
	        List<Paziente> pazienti = em.createQuery(cq).getResultList();
			return pazienti;
		}

		public void updatePaziente(Paziente paziente) {
	        em.merge(paziente);
		}
		
	    private void deletePaziente(Paziente paziente) {
	        em.remove(paziente);
	    }

		public void deletePaziente(String username) {
			Paziente paziente = em.find(Paziente.class, username);
	        deletePaziente(paziente);
		}
}
