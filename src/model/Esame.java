package model;

import java.util.Date;
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
	
	@Column(unique=true, nullable = false)
	private String codice;
	
	private String nome;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPrenotazioneEsame;
	
	@Temporal(TemporalType.DATE)
	private Date dataSvolgimentoEsame;

	@ManyToOne
	@Column(nullable = false)
	private TipologiaEsame tipologiaEsame;
	
	@ManyToOne 
	@Column(nullable = false)
	private Paziente paziente;
	
	@ManyToOne 
	@Column(nullable = false)
	private Medico medico;
	
	@OneToMany
	private List<Risultato> risultati;
	
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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Risultato> getRisultati() {
		return risultati;
	}
	private void creaCodice() {
		String cfPaziente= this.paziente.getCodiceFiscale();
		String dataPrenotazione= this.getDataPrenotazioneEsame().toString();
		this.setCodice(cfPaziente + dataPrenotazione);	
	}
	private void creaDataPrenotazione() {
		Date dataPrenotazione= new Date();
		this.setDataPrenotazioneEsame(dataPrenotazione);	
	}
}