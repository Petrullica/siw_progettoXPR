package model;

import java.util.Date;
import java.util.Map;

public class Esame {
	private TipologiaEsame tipologia;
	private Long id, codice;
	private Paziente paziente;
	private Medico medico;
	private Date dataPrenotazione;
	private Date dataEsame;
	private Map<String,String> risultati;

	public Esame(){}
	
	public Esame(Long codice, Medico medico, Date dataPrenotazione) {
		this.codice = codice;
		this.medico = medico;
		this.dataPrenotazione = dataPrenotazione;
	}

	public Long getId() {
		return id;
	}

	public Long getCodice() {
		return codice;
	}
	
	public void setCodice(Long codice) {
		this.codice = codice;
	}
	
	public TipologiaEsame getTipologia() {
		return tipologia;
	}

	public void setTipologia(TipologiaEsame tipologia) {
		this.tipologia = tipologia;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Date getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}
}