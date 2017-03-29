package org.cendra.bpm.model.tablero;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

	private String codigo;
	private String nombreCorto;
	private String nombre;
	private String descripcion;
	private Boolean tieneActividadReciente;
	private List<Lista> listas = new ArrayList<Lista>();

	private TableroPerfil perfilPorDefecto;

}
