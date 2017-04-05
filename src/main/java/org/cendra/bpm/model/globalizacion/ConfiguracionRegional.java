package org.cendra.bpm.model.globalizacion;

import java.io.Serializable;

public class ConfiguracionRegional implements Serializable, Comparable<ConfiguracionRegional>, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3926997642908969281L;

	private String id;
	private Boolean erased = false;
	private String lenguaje;
	private String pais;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getErased() {

		if (erased == null) {
			erased = false;
		}

		return erased;
	}

	public void setErased(Boolean erased) {

		if (erased == null) {
			erased = false;
		}

		this.erased = erased;
	}

	public String getLenguaje() {
		this.lenguaje = formatLenguaje(lenguaje);

		return this.lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = formatLenguaje(lenguaje);
	}

	public String getPais() {
		this.pais = formatPais(pais);
		return pais;
	}

	public void setPais(String pais) {
		this.pais = formatPais(pais);
	}

	private String formatLenguaje(String lenguaje) {

		if (lenguaje != null && lenguaje.trim().length() == 0) {
			lenguaje = null;
		}

		if (lenguaje != null) {
			lenguaje = lenguaje.trim().toLowerCase();
		}

		return lenguaje;
	}

	private String formatPais(String pais) {

		if (pais != null && pais.trim().length() == 0) {
			pais = null;
		}

		if (pais != null) {
			pais = pais.trim().toUpperCase();
		}

		return pais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lenguaje == null) ? 0 : lenguaje.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfiguracionRegional other = (ConfiguracionRegional) obj;
		if (lenguaje == null) {
			if (other.lenguaje != null)
				return false;
		} else if (!lenguaje.equals(other.lenguaje))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		return true;
	}

	public int compareTo(ConfiguracionRegional o) {

		return this.toString().compareTo(o.toString());

	}

	@Override
	public ConfiguracionRegional clone() throws CloneNotSupportedException {
		ConfiguracionRegional o = new ConfiguracionRegional();
		o.setLenguaje(this.getLenguaje());
		o.setPais(this.getPais());

		return o;
	}

	@Override
	public String toString() {

		if (this.getLenguaje() != null && this.getPais() != null) {

			return this.getLenguaje() + "_" + this.getPais();

		} else if (this.getLenguaje() != null && this.getPais() == null) {

			return this.getLenguaje() + "_";

		} else if (this.getLenguaje() == null && this.getPais() != null) {

			return "_" + this.getPais();

		} else if (this.getLenguaje() == null && this.getPais() == null) {

			return "";
		}

		return null;
	}
	
	public String toAllValues(){
		return this.getId();
	}

}
