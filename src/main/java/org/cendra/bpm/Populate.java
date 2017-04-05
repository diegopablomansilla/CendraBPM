package org.cendra.bpm;

import java.util.Locale;

import org.cendra.bpm.dao.globalizacion.ConfiguracionRegionalDAOx;
import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public class Populate {

	public static void populate() {

		Locale[] locales = Locale.getAvailableLocales();

		for (Locale locale : locales) {

			ConfiguracionRegional item = new ConfiguracionRegional();
			item.setLenguaje(locale.getLanguage());
			item.setPais(locale.getCountry());

			if ((locale.getLanguage() == null && locale.getCountry() == null) == false) {
				
			}
			
			ConfiguracionRegionalDAOx.getInstance().save(item);

		}

	}

}
