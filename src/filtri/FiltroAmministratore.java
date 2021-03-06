package filtri;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class FiltroAmministratore implements Filter {
	private ServletContext application;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		if (session.getAttribute("amministratore")==null) {
			RequestDispatcher rd  = this.application.getRequestDispatcher("/fallimento.jsp");
			rd.forward(request, response);	
		}
		else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {		
		this.application = fConfig.getServletContext();	
	}

	public void destroy() {		
	}
}