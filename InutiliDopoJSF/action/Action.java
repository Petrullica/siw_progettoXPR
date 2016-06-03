package action;

import model.Facade;
import javax.servlet.http.HttpServletRequest;
//lol
public interface Action {

	public String execute(HttpServletRequest request, Facade facade);

}
