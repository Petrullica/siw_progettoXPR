package model;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import model.Esame;
import model.Medico;
import model.Paziente;
import model.TipologiaEsame;


//Il costruttore tocca passargli solo codice e nome se
//La creazione della data è stata fatta bene...

@Stateless
public class EsameFacade {

	@PersistenceContext(unitName="clinica-unit")
    private EntityManager em;
 
	
	public Esame creaEsame(String codice, Date dataSvolgimentoEsame, Paziente paziente, Medico medico, TipologiaEsame tipologiaEsame) {
		Esame esame = new Esame(codice, dataSvolgimentoEsame, paziente,medico,tipologiaEsame);
		em.persist(esame);
		return esame;
	}
	
	public Esame getEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
		return esame;
	}
	
//	public TipologiaEsame getTipologia(){
//		 CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
//	        cq.select(cq.from(TipologiaEsame.class));
//	        
//	        List<Esame> esami = em.createQuery(cq).getResultList();
//			return esami;
//	}
	
	public List<Esame> getAllEsami() {
        CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
        cq.select(cq.from(Esame.class));
        List<Esame> esami = em.createQuery(cq).getResultList();
        
		return esami;
	}
	
	@SuppressWarnings("unchecked")
	public List<Esame> getEsamiByPazienteUsername(String username){

		Query q = em.createNativeQuery("select * from Esame where"
				+ " paziente_username = ?", Esame.class);
		q.setParameter(1, username);
		List<Esame> esami= q.getResultList();
		
		return esami;
	}
	
	@SuppressWarnings("unchecked")
	public List<Esame> getEsamiByIDMedico(Long id){
		Query q = em.createNativeQuery("select * from Esame where"
				+ " medico_id = ?", Esame.class);
		q.setParameter(1, id);
		List<Esame> esami= q.getResultList();
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


