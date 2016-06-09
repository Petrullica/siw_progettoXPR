package facade;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import model.Amministratore;

@Stateless
public class AmministratoreFacade {

	@PersistenceContext(unitName="clinica-unit")
	private EntityManager em;

	public Amministratore creaAmministratore(String nome, String cognome, String username, String password) {
		Amministratore amministratore = new Amministratore(nome, cognome, username, password);
		em.persist(amministratore);
		return amministratore;
	}

	public Amministratore getAmministratore(String username) {
		Amministratore amministratore = em.find(Amministratore.class, username);
		return amministratore;
	}

	public List<Amministratore> getAllAmministratori() {
		CriteriaQuery<Amministratore> cq = em.getCriteriaBuilder().createQuery(Amministratore.class);
		cq.select(cq.from(Amministratore.class));
		List<Amministratore> amministratori = em.createQuery(cq).getResultList();
		return amministratori;
	}

	public void updateAmministratore(Amministratore amministratore) {
		em.merge(amministratore);
	}

	private void deleteAmministratore(Amministratore amministratore) {
		em.remove(amministratore);
	}

	public void deleteAmministratore(String username) {
		Amministratore amministratore = em.find(Amministratore.class, username);
		deleteAmministratore(amministratore);
	}
}