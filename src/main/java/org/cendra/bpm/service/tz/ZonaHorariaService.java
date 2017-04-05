package org.cendra.bpm.service.tz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public class ZonaHorariaService {

	private static ZonaHorariaService instance;
	private static final Logger LOGGER = Logger.getLogger(ZonaHorariaService.class.getName());

	private final HashMap<String, ConfiguracionRegional> items = new HashMap<String, ConfiguracionRegional>();

	private ZonaHorariaService() {
	}

	public static ZonaHorariaService getInstance() {
		if (instance == null) {
			instance = new ZonaHorariaService();
			instance.ensureTestData();
		}
		return instance;
	}

	public synchronized List<ConfiguracionRegional> findAll() {
		return findAll(null);
	}

	public synchronized List<ConfiguracionRegional> findAll(String stringFilter) {
		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (stringFilter == null) {
			return arrayList;
		}

		stringFilter = stringFilter.trim();

		for (ConfiguracionRegional item : items.values()) {
			try {
				boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
						|| item.toString().toLowerCase().contains(stringFilter.toLowerCase());
				if (passesFilter) {
					arrayList.add(item.clone());
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ZonaHorariaService.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		Collections.sort(arrayList, new Comparator<ConfiguracionRegional>() {

			public int compare(ConfiguracionRegional o1, ConfiguracionRegional o2) {
				return (o2.toString().compareTo(o2.toString()));
			}
		});
		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAllByLenguaje(String stringFilter) {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (stringFilter == null) {
			return arrayList;
		}

		stringFilter = stringFilter.trim();

		for (ConfiguracionRegional item : items.values()) {
			try {

				if (item.getLenguaje() != null) {
					boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
							|| item.getLenguaje().toLowerCase().contains(stringFilter.toLowerCase());

					if (passesFilter) {
						arrayList.add(item.clone());
					}
				}

			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ZonaHorariaService.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		Collections.sort(arrayList, new Comparator<ConfiguracionRegional>() {

			public int compare(ConfiguracionRegional o1, ConfiguracionRegional o2) {
				return (o2.toString().compareTo(o2.toString()));
			}
		});
		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAllByPais(String stringFilter) {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (stringFilter == null) {
			return arrayList;
		}

		stringFilter = stringFilter.trim();

		for (ConfiguracionRegional item : items.values()) {
			try {

				if (item.getPais() != null) {
					boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
							|| item.getPais().toUpperCase().contains(stringFilter.toUpperCase());

					if (passesFilter) {
						arrayList.add(item.clone());
					}
				}

			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ZonaHorariaService.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		Collections.sort(arrayList, new Comparator<ConfiguracionRegional>() {

			public int compare(ConfiguracionRegional o1, ConfiguracionRegional o2) {
				return (o2.toString().compareTo(o2.toString()));
			}
		});
		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAll(String stringFilter, int start, int maxresults) {
		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();
		for (ConfiguracionRegional item : items.values()) {
			try {
				boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
						|| item.toString().toLowerCase().contains(stringFilter.toLowerCase());
				if (passesFilter) {
					arrayList.add(item.clone());
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ZonaHorariaService.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		Collections.sort(arrayList, new Comparator<ConfiguracionRegional>() {

			public int compare(ConfiguracionRegional o1, ConfiguracionRegional o2) {
				return (o2.toString().compareTo(o2.toString()));
			}
		});

		int end = start + maxresults;
		if (end > arrayList.size()) {
			end = arrayList.size();
		}
		return arrayList.subList(start, end);
	}

	public synchronized long count() {
		return items.size();
	}

	public synchronized void delete(ConfiguracionRegional value) {
		items.remove(value.toString());
	}

	public synchronized void save(ConfiguracionRegional entry) {
		if (entry == null) {
			LOGGER.log(Level.SEVERE, "Item is null");
			return;
		}

		try {
			entry = (ConfiguracionRegional) entry.clone();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		items.put(entry.toString(), entry);
	}

	private void ensureTestData() {
		if (findAll().isEmpty()) {

			Locale[] locales = Locale.getAvailableLocales();

			for (Locale locale : locales) {
				ConfiguracionRegional item = new ConfiguracionRegional();
				item.setLenguaje(locale.getLanguage());
				item.setPais(locale.getCountry());

				if ((locale.getLanguage() == null && locale.getCountry() == null) == false) {
					save(item);
				}

			}

		}
	}

}