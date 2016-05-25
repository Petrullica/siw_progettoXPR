package model;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Esame {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String codice;
	
	@ManyToOne
	@Column(nullable = false)
	private TipologiaEsame tipologia;
	
	@ManyToOne 
	@Column(nullable = false)
	private Paziente paziente;
	
	@ManyToOne 
	@Column(nullable = false)
	private Medico medico;
	
	@Column(nullable = false)
	private Date dataPrenotazione;
	
	private Date dataEsame;
	
	private Map<String,String> risultati;

	
	public Esame(){}
	
	public Esame(String codice, Medico medico, Paziente paziente) {
		this.codice = codice;
		this.medico = medico;
		this.creaDataPrenotazione();
		this.paziente= paziente;
		this.creaCodice();
	}



	public Long getId() {
		return id;
	}

	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String codice) {
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
	

	private void creaCodice() {
		String cfPaziente= this.paziente.getCodiceFiscale();
		String dataPrenotazione= this.getDataPrenotazione().toString();
		this.setCodice(cfPaziente + dataPrenotazione);
		
	}

	private void creaDataPrenotazione() {
		Date dataPrenotazione= new Date();
		this.setDataPrenotazione(dataPrenotazione);;
		
	}
}