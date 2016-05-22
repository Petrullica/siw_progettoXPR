package helper;

import javax.servlet.http.HttpServletRequest;

public class HelperTipologiaEsame {
	
	
	public boolean validate(HttpServletRequest request)
	{
		String nome,descrizione,prezzo;
		String nomeError,descrizioneError,prezzoError;
		boolean corretto = true;
		
		nome = request.getParameter("nome");
		descrizione = request.getParameter("descrizione");
		prezzo = request.getParameter("prezzo");
		
		if(nome.equals(""))
		{
			corretto = false;
			nomeError = "Nome: Campo Obbligatorio";
			request.setAttribute("nomeError", nomeError);
		}
		
		if(descrizione.equals(""))
		{
			corretto = false;
			descrizioneError = "Descrizione: Campo Obbligatorio";
			request.setAttribute("descrizioneError", descrizioneError);
		}
		
		if(prezzo.equals(""))
		{
			corretto = false;
			prezzoError = "Prezzo: Campo Obbligatorio";
			request.setAttribute("prezzoError", prezzoError);
		}
		
		
		return corretto;
	}

}
