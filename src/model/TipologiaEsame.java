package model;

import java.util.Map;

public class TipologiaEsame {
	
	private Long codice;
	private String nome;
	private String descr;
	private Map<String,String> prerequisti;
	private Map<String,String> indicatoriRequisiti;
	
	
	
	public Long getCodice() {
		return codice;
	}
	public void setCodice(Long codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Map<String, String> getPrerequisti() {
		return prerequisti;
	}
	public void setPrerequisti(Map<String, String> prerequisti) {
		this.prerequisti = prerequisti;
	}
	public Map<String, String> getIndicatoriRequisiti() {
		return indicatoriRequisiti;
	}
	public void setIndicatoriRequisiti(Map<String, String> indicatoriRequisiti) {
		this.indicatoriRequisiti = indicatoriRequisiti;
	}
	
	

}
