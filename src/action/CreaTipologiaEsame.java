package action;


import javax.servlet.http.HttpServletRequest;
import controller.HelperTipologiaEsame;
import model.Facade;
import model.TipologiaEsame;

public class CreaTipologiaEsame implements Action {

	public String execute(HttpServletRequest request, Facade facade) {


		HelperTipologiaEsame helper = new HelperTipologiaEsame();
		if (helper.validate(request)) {
			TipologiaEsame tipologia = new TipologiaEsame();

			tipologia.setNome(request.getParameter("nome"));
			tipologia.setDescrizione(request.getParameter("descrizione"));
			tipologia.setCosto(Double.parseDouble(request.getParameter("prezzo")));
			facade.creaNuovaTipologiaEsame(tipologia);


			request.setAttribute("tipologiaEsame", tipologia);
			return "/riepilogoInserimentoTipologiaEsame.jsp";
		}
		else {
			return "/inserisciNuovaTipologiaEsame.jsp";
		}
	}
}
