package org.cendra.bpm.model.hoja_ruta;

import java.util.ArrayList;
import java.util.List;

/** Etapa (fase) de Tarjeta */
public class Fase {

	private String codigo;
	private String nombreCorto;
	private String nombre;
	private String descripcion;
	private Integer orden;

	private Fase anterior;
	private Fase siguiente;

	private Fase supraFase;
	private List<Fase> subFases = new ArrayList<Fase>();
	
	private CicloVida cicloVida;

}
