package model;

import java.util.Map;

public class TipologiaEsame {
	
	private Long id;
	private String nome;
	private String descr;
	private double price;
	private Map<String,String> prerequisti;
	private Map<String,String> indicatoriRequisiti;
	
	public TipologiaEsame(String nome, String descr, double price) {
		this.nome = nome;
		this.descr = descr;
		this.price = price;
	}
	
	
	
	public TipologiaEsame(String nome, String descr, double price, Map<String, String> prerequisti,
			Map<String, String> indicatoriRequisiti) {
		this.nome = nome;
		this.descr = descr;
		this.price = price;
		this.prerequisti = prerequisti;
		this.indicatoriRequisiti = indicatoriRequisiti;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getId() {
		return id;
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