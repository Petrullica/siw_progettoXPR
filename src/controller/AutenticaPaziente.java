package controller;
import java.io.*;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import action.LoginAction;

@WebServlet("/autentica")
public class AutenticaPaziente extends HttpServlet {

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
		LoginAction login = new LoginAction();
		String esito = login.esegui(request);
		if (esito.equals("OK"))
			prossimaPagina = "/autenticatoPaziente.jsp";
		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(prossimaPagina);
		rd.forward(request, response);
	}
}
