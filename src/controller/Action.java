package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Facade;
import model.TipologiaEsame;;

public class Action {
	
	public String execute(HttpServletRequest request) {
		TipologiaEsame tipologia = new TipologiaEsame();
		Facade facade = new Facade();
		HttpSession session = request.getSession();
		
		tipologia.setNome(request.getParameter("nome"));
		tipologia.setDescrizione(request.getParameter("descrizione"));
		tipologia.setCosto(Double.parseDouble(request.getParameter("prezzo")));
		facade.creaNuovaTipologiaEsame(tipologia);
		
		
		session.setAttribute("tipologiaEsame", tipologia);
		return "/riepilogoInserimentoTipologiaEsame.jsp";
	}
}