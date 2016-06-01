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
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			Paziente paziente = new Paziente(nome, cognome);
			paziente.setUsername(username);
			paziente.setPassword(password);
			facade.creaNuovoPaziente(paziente);

			request.setAttribute("paziente", paziente);
			return "/autenticatoPaziente.jsp";
		}
		else {
			return "/inserisciNuovoPaziente.jsp";
		}
	}
}
