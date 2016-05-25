package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Prerequisito;

public class PrerequisitiDao extends Dao<Prerequisito> {

	public PrerequisitiDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Prerequisito> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
