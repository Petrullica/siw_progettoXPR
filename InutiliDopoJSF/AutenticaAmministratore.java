package controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import action.LoginAmministratoreAction;

@WebServlet("/autenticaAmministratore")
public class AutenticaAmministratore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String prossimaPagina = "/fallimento.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
		rd.forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String prossimaPagina = "/fallimento.jsp";
		LoginAmministratoreAction login = new LoginAmministratoreAction();
		String esito = login.esegui(request);
		if (esito.equals("OK"))
			prossimaPagina = "/autenticatoAmministratore.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
		rd.forward(request, response);
	}
}
