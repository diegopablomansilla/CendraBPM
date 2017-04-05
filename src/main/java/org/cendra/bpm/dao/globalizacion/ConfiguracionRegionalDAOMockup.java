package org.cendra.bpm.dao.globalizacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.cendra.bpm.MockUpDB;
import org.cendra.bpm.dao.InsertDuplicateException;
import org.cendra.bpm.dao.InsertNullException;
import org.cendra.bpm.dao.ArgumentsQueryNullException;
import org.cendra.bpm.dao.UpdateObjcetNotFoundException;
import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public class ConfiguracionRegionalDAOMockup implements IConfiguracionRegionalDAO {

	private static final Logger LOGGER = Logger.getLogger(ConfiguracionRegionalDAOMockup.class.getName());

	public List<ConfiguracionRegional> findAll() throws Exception {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				arrayList.add(item.clone());
			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllDisabled() throws Exception {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getErased() == true) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllEnabled() throws Exception {

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getErased() == false) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAll(String stringFilter) throws Exception {

		if (stringFilter == null || stringFilter.isEmpty()) {

			throw new ArgumentsQueryNullException();
		}

		stringFilter = stringFilter.trim();

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.toAllValues().toLowerCase().contains(stringFilter.toLowerCase())) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllById(String id) throws Exception {

		if (id == null || id.isEmpty()) {

			throw new ArgumentsQueryNullException();
		}

		id = id.trim();

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getId().equalsIgnoreCase(id)) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllByLenguaje(String lenguaje) throws Exception {

		if (lenguaje == null || lenguaje.isEmpty()) {

			throw new ArgumentsQueryNullException();
		}

		lenguaje = lenguaje.trim();

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getLenguaje().equalsIgnoreCase(lenguaje)) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllByPais(String pais) throws Exception {

		if (pais == null || pais.isEmpty()) {

			throw new ArgumentsQueryNullException();
		}

		pais = pais.trim();

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getPais().equalsIgnoreCase(pais)) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAllByLenguajeAndPais(String lenguaje, String pais) throws Exception {

		if (lenguaje == null || lenguaje.isEmpty() || pais == null || pais.isEmpty()) {

			throw new ArgumentsQueryNullException();
		}

		lenguaje = lenguaje.trim();
		pais = pais.trim();

		ArrayList<ConfiguracionRegional> arrayList = new ArrayList<ConfiguracionRegional>();

		try {

			for (ConfiguracionRegional item : MockUpDB.configuracionesRegionales.values()) {

				if (item.getLenguaje().equalsIgnoreCase(lenguaje) && item.getPais().equalsIgnoreCase(pais)) {
					arrayList.add(item.clone());
				}

			}

			Collections.sort(arrayList);

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

		return arrayList;
	}

	public List<ConfiguracionRegional> findAll(int start, int maxresults) throws Exception {

		return null;
	}

	public List<ConfiguracionRegional> findAll(String stringFilter, int start, int maxresults) {

		return null;
	}

	public List<ConfiguracionRegional> findByLenguaje(String lenguaje, int start, int maxresults) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ConfiguracionRegional> findByPais(String pais, int start, int maxresults) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ConfiguracionRegional> findAllByLenguajeAndPais(String lenguaje, String pais, int start,
			int maxresults) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		return MockUpDB.configuracionesRegionales.size();
	}

	public void delete(ConfiguracionRegional item) throws Exception {
		try {

			if (item.getId() == null || item.getId() == null || item.getId().isEmpty()) {

				throw new InsertNullException();
			}

			item = (ConfiguracionRegional) item.clone();

			if (MockUpDB.configuracionesRegionales.containsKey(item.getId())) {

				ConfiguracionRegional o = MockUpDB.configuracionesRegionales.get(item.getId());
				o.setErased(true);

			} else {
				throw new UpdateObjcetNotFoundException(item.getId());
			}

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}
	}

	public void insert(ConfiguracionRegional item) throws Exception {
		try {

			if (item.getId() == null || item.getId() == null || item.getId().isEmpty()) {

				throw new InsertNullException();
			}

			item = (ConfiguracionRegional) item.clone();

			if (MockUpDB.configuracionesRegionales.containsKey(item.getId())) {

				throw new InsertDuplicateException(item.getId());

			} else {

				MockUpDB.configuracionesRegionales.put(item.getId(), item);

			}

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

	}

	public void update(ConfiguracionRegional item) throws Exception {

		try {

			if (item.getId() == null || item.getId() == null || item.getId().isEmpty()) {

				throw new InsertNullException();
			}

			item = (ConfiguracionRegional) item.clone();

			if (MockUpDB.configuracionesRegionales.containsKey(item.getId())) {

				ConfiguracionRegional o = MockUpDB.configuracionesRegionales.get(item.getId());
				o.setLenguaje(item.getLenguaje());
				o.setPais(item.getPais());

			} else {
				throw new UpdateObjcetNotFoundException(item.getId());
			}

		} catch (Exception e) {

			LOGGER.log(Level.SEVERE, e.toString());

			throw e;
		}

	}

}
