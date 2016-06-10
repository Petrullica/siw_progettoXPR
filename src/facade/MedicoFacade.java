package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Esame;
import model.Medico;

@Stateless
public class MedicoFacade {
	
	 @PersistenceContext(unitName="clinica-unit")
	    private EntityManager em;
	 
		public Medico creaMedico(String nome, String cognome, String specializzazione) {
			Medico medico = new Medico(nome, cognome, specializzazione);
			em.persist(medico);
			return medico;
		}
		
		public Medico getMedico(Long id) {
			Medico medico = em.find(Medico.class, id);
			return medico;
		}
		
		public List<Medico> getAllMedici() {
	        CriteriaQuery<Medico> cq = em.getCriteriaBuilder().createQuery(Medico.class);
	        cq.select(cq.from(Medico.class));
	        List<Medico> medici = em.createQuery(cq).getResultList();
			return medici;
		}
		
		@SuppressWarnings("unchecked")
		public List<Esame> getEsamiByIDMedico(Long id){
			Query q = em.createNativeQuery("select * from Esame where"
					+ " medico_id = ?", Esame.class);
			q.setParameter(1, id);
			List<Esame> esami= q.getResultList();
			return esami;
		}

		
		public void updateMedico(Medico medico) {
	        em.merge(medico);
		}
		
	    private void deleteMedico(Medico medico) {
	        em.remove(medico);
	    }

		public void deleteMedico(Long id) {
			Medico medico = em.find(Medico.class, id);
	        deleteMedico(medico);
		}

		public Medico getMedicoByNomeCognome(String nome, String cognome) {
			Query q= em.createNativeQuery("select * from Medico where nome = ? and cognome = ?", Medico.class);
			q.setParameter(1, nome);
			q.setParameter(2, cognome);
			Medico medico= (Medico) q.getSingleResult();
			return medico;
			
		}
}
