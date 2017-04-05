package org.cendra.bpm.dao.globalizacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.cendra.bpm.MockUpDB;
import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public class ConfiguracionRegionalDAOx {

	private static ConfiguracionRegionalDAOx instance;
	private static final Logger LOGGER = Logger.getLogger(ConfiguracionRegionalDAOx.class.getName());

	private ConfiguracionRegionalDAOx() {
	}

	public static ConfiguracionRegionalDAOx getInstance() {
		if (instance == null) {
			instance = new ConfiguracionRegionalDAOx();
			// instance.ensureTestData();
		}
		return instance;
	}

	public synchronized List<ConfiguracionRegional> findAll() {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

			try {
				arrayList.add(item.clone());
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ConfiguracionRegionalDAOx.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

		Collections.sort(arrayList);

		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAll(String stringFilter) {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (stringFilter == null || stringFilter.isEmpty()) {

			return findAll();

		}

		stringFilter = stringFilter.trim();

		for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {
			try {
				if (item.toString().toLowerCase().contains(stringFilter.toLowerCase()) == true) {
					arrayList.add(item.clone());
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ConfiguracionRegionalDAOx.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

		Collections.sort(arrayList);

		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAllByLenguaje(String lenguaje) {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (lenguaje == null || lenguaje.isEmpty()) {

			return arrayList;

		}

		lenguaje = lenguaje.trim();

		for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {
			try {
				if (item != null && item.getLenguaje() != null
						&& item.getLenguaje().equals(lenguaje.toLowerCase()) == true) {
					
					arrayList.add(item.clone());
					
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ConfiguracionRegionalDAOx.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

		Collections.sort(arrayList);

		return arrayList;
	}

	public synchronized List<ConfiguracionRegional> findAllByPais(String stringFilter) {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		if (stringFilter == null) {
			return arrayList;
		}

		stringFilter = stringFilter.trim();

		for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {
			try {

				if (item.getPais() != null) {
					boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
							|| item.getPais().toUpperCase().contains(stringFilter.toUpperCase());

					if (passesFilter) {
						arrayList.add(item.clone());
					}
				}

			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ConfiguracionRegionalDAOx.class.getName()).log(Level.SEVERE, null, ex);
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
		for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {
			try {
				boolean passesFilter = (stringFilter == null || stringFilter.isEmpty())
						|| item.toString().toLowerCase().contains(stringFilter.toLowerCase());
				if (passesFilter) {
					arrayList.add(item.clone());
				}
			} catch (CloneNotSupportedException ex) {
				Logger.getLogger(ConfiguracionRegionalDAOx.class.getName()).log(Level.SEVERE, null, ex);
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
		return MockUpDB.configuracionesRegionales.size();
	}

	public synchronized void delete(ConfiguracionRegional value) {
		MockUpDB.configuracionesRegionales.remove(value.toString());
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
		MockUpDB.configuracionesRegionales.put(entry.toString(), entry);
	}

}