package org.cendra.bpm.model.tablero;

import java.util.ArrayList;

public class Tablero extends ArrayList<TableroLista> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5761326727837308406L;

	private String codigo;
	private String nombreCorto;
	private String nombre;
	private String descripcion;
	private Boolean tieneActividadReciente;

	private TableroPerfil perfilPorDefecto;

}
