package model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Clinica {

 private Map<Long, Esame> esamiDaSvolgere;
 private Map<Long, Esame> esamiSvolti;
 private Map<Long, TipologiaEsame> tipologieEsami;
 private Map<Long,Paziente> pazienti;
 private Map<Long, Medico> medici;
 
 //stocazzosfe
 
public Clinica() {
	this.esamiDaSvolgere = new HashMap<>();
	this.esamiSvolti = new HashMap<>();
	this.tipologieEsami = new HashMap<>();
	this.pazienti = new HashMap<>();
	this.medici = new HashMap<>();

}

public List<TipologiaEsame> mostraTipologie(){
	return new LinkedList<>(tipologieEsami.values());
}

public TipologiaEsame trovaTipologia(Long key){
	return tipologieEsami.get(key);
}

public Paziente trovaPaziente(Long key){
	return pazienti.get(key);
}

public void aggiungiTipologia(TipologiaEsame tipologiaEsame){
	this.tipologieEsami.put(tipologiaEsame.getId(), tipologiaEsame);
}

public void SpostaEsame(Esame esame){
	this.esamiSvolti.put(esame.getId(), esame);
	this.esamiDaSvolgere.remove(esame.getId());
}

//wgrre

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
public Map<Long, TipologiaEsame> getTipologieEsami() {
	return tipologieEsami;
}
public void setTipologieEsami(Map<Long, TipologiaEsame> tipologieEsami) {
	this.tipologieEsami = tipologieEsami;
}
public Map<Long, Paziente> getPazienti() {
	return pazienti;
}
public void setPazienti(Map<Long, Paziente> pazienti) {
	this.pazienti = pazienti;
}
public Map<Long, Medico> getMedici() {
	return medici;
}
public void setMedici(Map<Long, Medico> medici) {
	this.medici = medici;
}
 

}
