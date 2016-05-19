package model;

import java.util.List;

public class UtentiPazientiController {
	/* Ho inserito i metodi: consultaTipologiaEsame; mostraDettagliTipologiaEsame;
	 * MostraElencoEsami;  MostraDettaglioEsame; 
	 *  
	 
	 */

	private Paziente pazienteCorrente;
	private Esame esame;
	private Clinica clinica;

	public Paziente getPazienteCorrente() {
		return pazienteCorrente;
	}
	public void setPazienteCorrente(Paziente pazienteCorrente) {
		this.pazienteCorrente = pazienteCorrente;
	}
	public Esame getEsame() {
		return esame;
	}
	public void setEsame(Esame esame) {
		this.esame = esame;
	}
	public Clinica getClinica() {
		return clinica;
	}
	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}

	public List<TipologiaEsame> consultaTipologiaEsame(){
		return this.clinica.mostraTipologie();
	}
	
	public TipologiaEsame mostraDettagliTipologiaEsame(String nomeTipologiaEsame){
		return this.clinica.trovaTipologia(nomeTipologiaEsame);
	}
	public List<Esame> mostraElencoEsami(){
		return this.clinica.mostraEsamiDaSvolgere();
	}
    public Esame mostraDettaglioEsame(Long codiceEsame){
       return this.mostraDettaglioEsame(codiceEsame);
    	
    }
}
