package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Esame;

public class EsameDao extends Dao<Esame> {

	public EsameDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Esame> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
