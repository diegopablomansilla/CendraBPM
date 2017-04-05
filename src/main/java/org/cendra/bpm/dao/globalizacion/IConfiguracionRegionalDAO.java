package org.cendra.bpm.dao.globalizacion;

import java.util.List;

import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public interface IConfiguracionRegionalDAO {

	public List<ConfiguracionRegional> findAll() throws Exception;

	public List<ConfiguracionRegional> findAllDisabled() throws Exception;

	public List<ConfiguracionRegional> findAllEnabled() throws Exception;

	public List<ConfiguracionRegional> findAll(String stringFilter) throws Exception;

	public List<ConfiguracionRegional> findAllById(String lenguaje) throws Exception;

	public List<ConfiguracionRegional> findAllByLenguaje(String lenguaje) throws Exception;

	public List<ConfiguracionRegional> findAllByPais(String pais) throws Exception;

	public List<ConfiguracionRegional> findAllByLenguajeAndPais(String lenguaje, String pais) throws Exception;

	public List<ConfiguracionRegional> findAll(int start, int maxresults) throws Exception;

	public List<ConfiguracionRegional> findAll(String stringFilter, int start, int maxresults);

	public List<ConfiguracionRegional> findByLenguaje(String lenguaje, int start, int maxresults);

	public List<ConfiguracionRegional> findByPais(String pais, int start, int maxresults);

	public List<ConfiguracionRegional> findAllByLenguajeAndPais(String lenguaje, String pais, int start,
			int maxresults);

	public long count();

	public void delete(ConfiguracionRegional item) throws Exception;

	public void insert(ConfiguracionRegional item) throws Exception;

	public void update(ConfiguracionRegional item) throws Exception;

}
