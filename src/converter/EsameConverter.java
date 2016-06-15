package converter;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import facade.EsameFacade;
import model.Esame;

@ManagedBean
public class EsameConverter implements Converter{
	
    @EJB
    private EsameFacade esameFacade;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String submittedValue) {
        Esame esame = esameFacade.getEsameByCodice(submittedValue);
        return esame;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object modelValue) {
        if (modelValue == null) {
            return "";
        }

        if (modelValue instanceof Esame) {
            return String.valueOf(((Esame) modelValue).getCodice());
        } else {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid Esame", modelValue)));
        }
    }

}
