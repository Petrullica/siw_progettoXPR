package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Amministratore;

public class AmministratoreDao extends Dao<Amministratore> {

	public AmministratoreDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Amministratore> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
