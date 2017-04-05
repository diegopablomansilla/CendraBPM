package org.cendra.bpm.model.tz;

import java.io.Serializable;

import org.cendra.bpm.model.globalizacion.ConfiguracionRegional;

public class ZonaHorariaNombre implements Serializable, Comparable<ZonaHorariaNombre>, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7267577259746227443L;

	private ConfiguracionRegional configuracionRegional;
	private String nombreCorto;
	private String nombreLargo;

	public ConfiguracionRegional getConfiguracionRegional() {
		return configuracionRegional;
	}

	public void setConfiguracionRegional(ConfiguracionRegional configuracionRegional) {
		this.configuracionRegional = configuracionRegional;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((configuracionRegional == null) ? 0 : configuracionRegional.hashCode());
		result = prime * result + ((nombreCorto == null) ? 0 : nombreCorto.hashCode());
		result = prime * result + ((nombreLargo == null) ? 0 : nombreLargo.hashCode());
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
		ZonaHorariaNombre other = (ZonaHorariaNombre) obj;
		if (configuracionRegional == null) {
			if (other.configuracionRegional != null)
				return false;
		} else if (!configuracionRegional.equals(other.configuracionRegional))
			return false;
		if (nombreCorto == null) {
			if (other.nombreCorto != null)
				return false;
		} else if (!nombreCorto.equals(other.nombreCorto))
			return false;
		if (nombreLargo == null) {
			if (other.nombreLargo != null)
				return false;
		} else if (!nombreLargo.equals(other.nombreLargo))
			return false;
		return true;
	}

	public int compareTo(ZonaHorariaNombre o) {

		return this.toString().compareTo(o.toString());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ZonaHorariaNombre o = new ZonaHorariaNombre();
		o.setConfiguracionRegional(this.getConfiguracionRegional().clone());
		o.setNombreCorto(this.getNombreCorto());
		o.setNombreLargo(this.getNombreLargo());

		return o;
	}

	@Override
	public String toString() {

		if (nombreLargo != null && configuracionRegional != null) {
			return "(" + configuracionRegional + ") " + nombreLargo;
		}

		if (nombreCorto != null && configuracionRegional != null) {
			return "(" + configuracionRegional + ") " + nombreCorto;
		}

		if (nombreLargo != null && configuracionRegional == null) {
			return nombreLargo;
		}

		if (nombreCorto != null && configuracionRegional == null) {
			return nombreCorto;
		}

		return "";
	}

}
