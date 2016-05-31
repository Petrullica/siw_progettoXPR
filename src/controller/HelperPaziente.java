package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperPaziente {
	
	public boolean validate(HttpServletRequest request)	{
		boolean corretto = true;
		String nome,cognome;
		String nomeError,cognomeError;
		
		nome = request.getParameter("nome");
		cognome = request.getParameter("cognome");
		
		if(nome.equals(""))	{
			corretto = false;
			nomeError = "Nome: Campo Obbligatorio";
			request.setAttribute("nomeError", nomeError);
		}
		if(cognome.equals("")) {
			corretto = false;
			cognomeError = "Cognome: Campo Obbligatorio";
			request.setAttribute("cognomeError", cognomeError);
		}
		return corretto;
	}
}