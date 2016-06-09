package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Esame {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column
	private String codice;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPrenotazioneEsame;

	@Temporal(TemporalType.DATE)
	private Date dataSvolgimentoEsame;

	@ManyToOne
	private TipologiaEsame tipologiaEsame;

	@ManyToOne 
	private Paziente paziente;

	@ManyToOne 
	private Medico medico;

	@OneToMany(mappedBy = "esame")
	private List<Risultato> risultati;

	public Esame(){
		this.risultati= new LinkedList<Risultato>();
	}

	public Esame(String codice, Date dataSvolgimentoEsame) {
		this.codice = codice;
		this.creaDataPrenotazione();
		this.dataSvolgimentoEsame = dataSvolgimentoEsame;
	}

	public Esame(String codice, Date dataSvolgimentoEsame,Paziente paziente,Medico medico,TipologiaEsame tipologiaEsame) {
		this.codice = codice;
		this.dataSvolgimentoEsame = dataSvolgimentoEsame;
		this.tipologiaEsame = tipologiaEsame;
		this.paziente = paziente;
		this.medico = medico;
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
		return tipologiaEsame;
	}

	public void setTipologia(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
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

	public Date getDataPrenotazioneEsame() {
		return dataPrenotazioneEsame;
	}

	public void setDataPrenotazioneEsame(Date dataPrenotazione) {
		this.dataPrenotazioneEsame = dataPrenotazione;
	}

	public Date getDataSvolgimentoEsame() {
		return dataSvolgimentoEsame;
	}

	public void setDataSvolgimentoEsame(Date dataEsame) {
		this.dataSvolgimentoEsame = dataEsame;
	}

	public List<Risultato> getRisultati() {
		return risultati;
	}

	private void creaDataPrenotazione() {
		Date dataPrenotazione= new Date();
		this.setDataPrenotazioneEsame(dataPrenotazione);	
	}
}