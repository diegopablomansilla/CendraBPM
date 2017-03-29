package org.cendra.bpm.model.hoja_ruta;

import java.util.ArrayList;
import java.util.List;

public class Paso {
	
	private String codigo;
	private String nombreCorto;
	private String nombre;
	private String descripcion;
	
	private List<Paso> siguientes = new ArrayList<Paso>();
	private Boolean esPasoFinal;
	
	private CicloVida cicloVida;

}
