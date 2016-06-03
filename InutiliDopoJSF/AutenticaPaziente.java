package controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import action.LoginPazienteAction;

@WebServlet("/autenticaPaziente")
public class AutenticaPaziente extends HttpServlet {
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
		LoginPazienteAction login = new LoginPazienteAction();
		String esito = login.esegui(request);
		if (esito.equals("OK"))
			prossimaPagina = "/autenticatoPaziente.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
		rd.forward(request, response);
	}
}
