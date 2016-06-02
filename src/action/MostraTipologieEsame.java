package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Facade;
import model.TipologiaEsame;

public class MostraTipologieEsame implements Action {

	@Override
	public String execute(HttpServletRequest request, Facade facade) {
		List<TipologiaEsame> tipologieEsame;
		tipologieEsame = facade.consultaTipologieEsame();
		request.setAttribute("tipologieEsame", tipologieEsame);
		return "/mostraTipologieEsame.jsp";
	}
}