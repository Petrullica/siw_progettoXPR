package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Clinica {
	/*Ho cancellato i get e i set, poi li riaggiungiamo se servono
	 * ho inserito: mostraEsamiDaSvolgere; trovaEsameDaSvolgere;
	 * */

	private Map<Long, Esame> esamiDaSvolgere;
	private Map<Long, Esame> esamiSvolti;
	private Map<String, TipologiaEsame> tipologieEsami;
	private Map<Long,Paziente> pazienti;
	private Map<Long, Medico> medici;

	public Clinica() {
		this.esamiDaSvolgere = new HashMap<>();
		this.esamiSvolti = new HashMap<>();
		this.tipologieEsami = new HashMap<>();
		this.pazienti = new HashMap<>();
		this.medici = new HashMap<>();
	}

	public List<Esame> mostraEsamiDaSvolgere(){
		return new LinkedList<>(esamiDaSvolgere.values());
	}
	public Esame trovaEsameDaSvolgere(Long key){
		return esamiDaSvolgere.get(key);
	}
	public List<TipologiaEsame> mostraTipologie(){
		return new LinkedList<>(tipologieEsami.values());
	}

	public TipologiaEsame trovaTipologia(String nomeTipologia){
		return tipologieEsami.get(nomeTipologia);
	}

	public Paziente trovaPaziente(Long key){
		return pazienti.get(key);
	}

	public void aggiungiTipologia(TipologiaEsame tipologiaEsame){
		this.tipologieEsami.put(tipologiaEsame.getNome(), tipologiaEsame);
	}

	public void SpostaEsame(Esame esame){
		this.esamiSvolti.put(esame.getId(), esame);
		this.esamiDaSvolgere.remove(esame.getId());
	}

}