package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Medico;

public class MedicoDao extends Dao<Medico> {

	public MedicoDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Medico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
