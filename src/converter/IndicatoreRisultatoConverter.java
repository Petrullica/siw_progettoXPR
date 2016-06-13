package converter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import facade.IndicatoreRisultatoFacade;
import model.IndicatoreRisultato;

@ManagedBean
public class IndicatoreRisultatoConverter implements Converter{

	@EJB
	private IndicatoreRisultatoFacade indicatoreRisultatoFacade;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
		return indicatoreRisultatoFacade.getIndicatoreRisultato(submittedValue);
	}


	@Override
	public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
		IndicatoreRisultato r = (IndicatoreRisultato)modelValue;
		return r.getNome();
	}
}

