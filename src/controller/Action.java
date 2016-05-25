package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.FacadeAmministrazione;
import model.TipologiaEsame;;

public class Action {
	
	public String execute(HttpServletRequest request) {
		TipologiaEsame tipologia = new TipologiaEsame();
		FacadeAmministrazione facade = new FacadeAmministrazione();
		HttpSession session = request.getSession();
		
		tipologia.setNome(request.getParameter("nome"));
		tipologia.setDescr(request.getParameter("descrizione"));
		tipologia.setPrice(Double.parseDouble(request.getParameter("prezzo")));
		facade.inserisciTipologiaEsame(tipologia);
		
		
		session.setAttribute("tipologiaEsame", tipologia);
		return "/riepilogoInserimentoTipologiaEsame.jsp";
	}
}