package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.Risultato;

public class RisultatoDao extends Dao<Risultato> {

	public RisultatoDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<Risultato> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
