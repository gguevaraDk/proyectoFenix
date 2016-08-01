package com.premize.samples.web.jsf.prime.web.popup;

import java.util.Iterator;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

import com.premize.pmz.web.AbstractBaseMessageUI;

/**
 * Gestiona el popup de resultados.
 * 
 * @author <a href="mailto:jorge.middleton@gmail.com">Jorge L. Middleton</a>
 * @date Nov 19, 2010
 * 
 */
public class PopupResultadoUI extends AbstractBaseMessageUI {

	public PopupResultadoUI() {
	}

	public String getMessageImage() {
		// See if there are messages queued for the page
		Severity severityLevel = getFacesContext().getMaximumSeverity();

		String messageImage = "";
		if (null != severityLevel) {
			if (severityLevel.equals(FacesMessage.SEVERITY_ERROR)) {
				messageImage = "/images/error.png";
			} else if (severityLevel.equals(FacesMessage.SEVERITY_INFO)) {
				messageImage = "/images/success.png";
			} else if (severityLevel.equals(FacesMessage.SEVERITY_WARN)) {
				messageImage = "/images/warn.png";
			} else if (severityLevel.equals(FacesMessage.SEVERITY_FATAL)) {
				messageImage = "/images/error.png";
			}
		}
		return messageImage;
	}

	public boolean isGlobalErrors() {
		Iterator<FacesMessage> messages = getFacesContext().getMessages(null);
		return messages != null && messages.hasNext();
	}

	public boolean isSeveritySucess() {
		for (Iterator<String> ii = getFacesContext().getClientIdsWithMessages(); ii
				.hasNext();) {
			if (ii.next() != null) {
				return false;
			}
		}
		return true;
	}
}
