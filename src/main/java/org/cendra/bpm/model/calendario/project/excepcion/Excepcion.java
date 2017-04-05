package org.cendra.bpm.model.calendario.project.excepcion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Excepcion {
	
	public String nombre;
	public Date comienzo; // null todo el año
	public Date fin; // null todo el año	
	public List<ExcepcionDetalle> detalles = new ArrayList<ExcepcionDetalle>();

}
