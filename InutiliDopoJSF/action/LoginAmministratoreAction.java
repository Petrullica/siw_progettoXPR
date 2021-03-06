package action;

import javax.servlet.*;
import javax.servlet.http.*;
import model.Facade;
import model.Paziente;

public class LoginAmministratoreAction {

	public LoginAmministratoreAction(){}

	public String esegui(HttpServletRequest request)
	  throws ServletException  {
		Facade authService = new Facade();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Paziente paziente = authService.loginPaziente(username, password);
		if (paziente!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("amministratore",paziente);
			return "OK";
		} else
			return "KO";
	}
}