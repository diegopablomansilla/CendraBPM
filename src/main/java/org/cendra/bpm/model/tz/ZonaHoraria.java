package org.cendra.bpm.model.tz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ZonaHoraria implements Serializable, Comparable<ZonaHoraria>, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9081569969738015296L;

	private String id;
	private List<ZonaHorariaNombre> nombres = new ArrayList<ZonaHorariaNombre>();
	private String diferenciaHoraria;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ZonaHorariaNombre> getNombres() {
		return nombres;
	}

	public void setNombres(List<ZonaHorariaNombre> nombres) {
		this.nombres = nombres;
	}

	public void addNombre(ZonaHorariaNombre nombre) {
		this.nombres.add(nombre);
	}

	public String getDiferenciaHoraria() {
		return diferenciaHoraria;
	}

	public void setDiferenciaHoraria(String diferenciaHoraria) {
		this.diferenciaHoraria = diferenciaHoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ZonaHoraria other = (ZonaHoraria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public int compareTo(ZonaHoraria o) {
		return this.toString().compareTo(o.toString());
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ZonaHoraria o = new ZonaHoraria();
		o.setId(this.getId());
		o.setDiferenciaHoraria(this.getDiferenciaHoraria());

		List<ZonaHorariaNombre> nombres = this.getNombres();

		if (nombres != null) {
			for (ZonaHorariaNombre item : nombres) {
				if (item != null) {
					o.addNombre((ZonaHorariaNombre) item.clone());
				} else {
					o.addNombre(null);
				}

			}
		}

		return o;
	}

	@Override
	public String toString() {
		if (id != null) {
			return id;
		}
		return "";
	}

}
