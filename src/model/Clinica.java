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
	private Map<String, Medico> medici; // la key è nome.concat(cognome)

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

	public Map<Long, Esame> getEsamiDaSvolgere() {
		return esamiDaSvolgere;
	}
	public void setEsamiDaSvolgere(Map<Long, Esame> esamiDaSvolgere) {
		this.esamiDaSvolgere = esamiDaSvolgere;
	}
	public Map<Long, Esame> getEsamiSvolti() {
		return esamiSvolti;
	}
	public void setEsamiSvolti(Map<Long, Esame> esamiSvolti) {
		this.esamiSvolti = esamiSvolti;
	}
	public Map<String, TipologiaEsame> getTipologieEsami() {
		return tipologieEsami;
	}
	public void setTipologieEsami(Map<String, TipologiaEsame> tipologieEsami) {
		this.tipologieEsami = tipologieEsami;
	}
	public Map<Long, Paziente> getPazienti() {
		return pazienti;
	}
	public void setPazienti(Map<Long, Paziente> pazienti) {
		this.pazienti = pazienti;
	}
	public Map<String, Medico> getMedici() {
		return medici;
	}
	public void setMedici(Map<String, Medico> medici) {
		this.medici = medici;
	}
}