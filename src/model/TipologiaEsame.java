package model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipologiaEsame {
	
	//TODO 
	//il nome è meglio "price" o "prezzo"? in jsp ho messo prezzo ma qua ci sta price, Xu
	
	private String nome;
	private String descr;
	private double price;
	
	//Commentato altrimenti non mi creava la tabella in postgres
	//Hibernate crea una colonna per ogni attributo e ovviamente un'entità non poteva essere una coppia
	//in pratica veniva fuori che una tupla conteneva due tuple, Xu
//	private Map<String,String> prerequisti;
//	private Map<String,String> indicatoriRequisiti;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public TipologiaEsame(){}
	
	public TipologiaEsame(String nome, String descr, double price) {
		this.nome = nome;
		this.descr = descr;
		this.price = price;
	}
	
//	public TipologiaEsame(String nome, String descr, double price, Map<String, String> prerequisti,
//			Map<String, String> indicatoriRequisiti) {
//		this.nome = nome;
//		this.descr = descr;
//		this.price = price;
//		this.prerequisti = prerequisti;
//		this.indicatoriRequisiti = indicatoriRequisiti;
//	}

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
//	public Map<String, String> getPrerequisti() {
//		return prerequisti;
//	}
//	public Map<String, String> getIndicatoriRequisiti() {
//		return indicatoriRequisiti;
//	}
}