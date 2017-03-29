package org.cendra.bpm.model.tablero;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String codigo;
	private String nombreCorto;
	private String nombre;
	private String descripcion;
	private List<GrupoItem> tableros = new ArrayList<GrupoItem>();

	private GrupoPerfil perfilPorDefecto;

}
