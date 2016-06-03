package facade;

import java.util.Date;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Esame;
import model.Paziente;
import model.TipologiaEsame;


//DA IMPLEMENTARE, ho vari dubbi su Esame, ad esempio siamo sicuri sia giusto il costruttore?

@Stateless
public class EsameFacade {

	@PersistenceContext(unitName="clinica-unit")
    private EntityManager em;
 
	
	public Esame creaEsame(String codice, String nome, Date dataPrenotazioneEsame, Date dataSvolgimentoEsame) {
		//Esame esame = new Esame(codice, nome, dataPrenotazioneEsame, dataSvolgimentoEsame);
		//em.persist(esame);
		return null;
	}

	public Esame getAllEsami() {
		// TODO Auto-generated method stub
		return null;
	}

	public Esame getPaziente(String codice) {
		// TODO Auto-generated method stub
		return null;
	}

}


