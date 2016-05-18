package model;

import java.util.Map;

public class TipologiaEsame {
	
	private Long id;
	private String nome;
	private String descr;
	private Map<String,String> prerequisti;
	private Map<String,String> indicatoriRequisiti;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
