package controller;

import java.util.List;

import model.TipologiaEsame;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import facade.TipologiaEsameFacade;

@ManagedBean
public class TipologiaEsameController {
		
		@ManagedProperty(value="#{param.id}")
		private Long id;
		private String nome;
		private Double prezzo;
		private String descrizione;
		private TipologiaEsame tipologiaEsame;
		private List<TipologiaEsame> tipologieEsame;
		
		@EJB
		private TipologiaEsameFacade tipologiaEsameFacade;
		
		public String creaTipologiaEsame() {
			this.tipologiaEsame = tipologiaEsameFacade.creaTipologiaEsame(nome, descrizione, prezzo);
			return "tipologiaEsame"; 
		}
		
		public String mostraTipologieEsame() {
			this.tipologieEsame = tipologiaEsameFacade.getAllTipologieEsami();
			return "tipologieEsame"; 
		}

		public String findTipologiaEsame() {
			this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
			return "tipologiaEsame";
		}
		
		public String findTipologiaEsame(Long id) {
			this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
			return "product";
		}

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

		public Double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(Double prezzo) {
			this.prezzo = prezzo;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public TipologiaEsame getTipologiaEsame() {
			return tipologiaEsame;
		}

		public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
			this.tipologiaEsame = tipologiaEsame;
		}

		public List<TipologiaEsame> getTipologieEsame() {
			return tipologieEsame;
		}

		public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
			this.tipologieEsame = tipologieEsame;
		}
		
		
}