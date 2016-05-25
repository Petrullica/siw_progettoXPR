package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Paziente;

public class PazienteDao extends Dao<Paziente> {

	public PazienteDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Paziente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
