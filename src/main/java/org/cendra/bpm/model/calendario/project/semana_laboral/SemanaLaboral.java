package org.cendra.bpm.model.calendario.project.semana_laboral;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SemanaLaboral {
	
	public String nombre;
	public Date comienzo; // null todo el año
	public Date fin; // null todo el año	
	public List<SemanaLaboralDetalle> detalles = new ArrayList<SemanaLaboralDetalle>();

}
