package facade;

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
import model.Risultato;
import model.TipologiaEsame;


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
	
	
	public List<Esame> getAllEsami() {
        CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
        cq.select(cq.from(Esame.class));
        List<Esame> esami = em.createQuery(cq).getResultList();
        
		return esami;
	}
	
	@SuppressWarnings("unchecked")
	public List<Risultato> getAllRisultati() {
		Query q = em.createNativeQuery("select esame.risultato_id from Esame "
				+ "left join risultato on esame_id = esame.id ", Esame.class);
		List<Risultato> risultati = q.getResultList();
		if (risultati == null) return null;
		else return risultati;	
	}
	
	public Esame getEsameByCodice(String codice) {
		Query q = em.createNativeQuery("select * from Esame "
				+ "where esame.codice = ?", Esame.class);
		q.setParameter(1, codice);
		Esame esame = (Esame)q.getSingleResult();
		return esame;
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
	public List<Esame> getEsamiEffettuatiByPazienteUsername(String username){
		Query q = em.createNativeQuery("select * from esame left join risultato on esame_id = esame.id"
				+ " where risultato.id IS NOT NULL and"
				+ " paziente_username = ?", Esame.class);
		q.setParameter(1, username);
		List<Esame> esami= q.getResultList();
		return esami;
	}
	
	@SuppressWarnings("unchecked")
	public List<Esame> getEsamiPrenotatiByPazienteUsername(String username){
		Query q = em.createNativeQuery("select * from esame left join risultato on esame_id = esame.id"
				+ " where risultato.id IS NULL and"
				+ " paziente_username = ? ", Esame.class);
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
	
	@SuppressWarnings("unchecked")
	public List<Esame> getAllEsamiDaCompletare() {
		Query q = em.createNativeQuery("select * from esame "
				+ "left join risultato on esame_id = esame.id"
				+ " where risultato.id IS NULL", Esame.class);
		List<Esame> esamiDaCompletare= q.getResultList();
		return esamiDaCompletare;
	}

	public Esame updateEsame(Esame esame) {
        Esame esameCompletato = em.merge(esame);
        return esameCompletato;
	}
	
    private void deleteEsame(Esame esame) {
        em.remove(esame);
    }

	public void deleteEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
        deleteEsame(esame);
	}
}


