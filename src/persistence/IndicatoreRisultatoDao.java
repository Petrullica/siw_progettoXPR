package persistence;

import java.util.List;

import javax.persistence.EntityManager;

import model.IndicatoreRisultato;

public class IndicatoreRisultatoDao extends Dao<IndicatoreRisultato> {

	public IndicatoreRisultatoDao(EntityManager em) {
		super(em);
	}

	@Override
	public List<IndicatoreRisultato> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
