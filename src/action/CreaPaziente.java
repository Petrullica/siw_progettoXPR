package action;


import javax.servlet.http.HttpServletRequest;
import controller.HelperPaziente;
import model.Facade;
import model.Paziente;

public class CreaPaziente implements Action {

	public String execute(HttpServletRequest request, Facade facade) {


		HelperPaziente helper = new HelperPaziente();
		if (helper.validate(request)) {
			
			String nome = request.getParameter("nome") ;
			String cognome = request.getParameter("cognome");
			
			Paziente paziente = new Paziente(nome, cognome);
			facade.creaNuovoPaziente(paziente);

			request.setAttribute("paziente", paziente);
			return "/riepilogoInserimentoPaziente.jsp";
		}
		else {
			return "/inserisciNuovoPaziente.jsp";
		}
	}
}
