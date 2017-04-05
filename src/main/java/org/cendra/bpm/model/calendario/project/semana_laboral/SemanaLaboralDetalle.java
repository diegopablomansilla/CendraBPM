package org.cendra.bpm.model.calendario.project.semana_laboral;

import java.util.ArrayList;
import java.util.List;

import org.cendra.bpm.model.calendario.project.FranjaHoraria;

public class SemanaLaboralDetalle {
	
	private Integer dia; // LUNES, MARTES, ...
	private Boolean noLaborable;
	private List<FranjaHoraria> franjasHorarias = new ArrayList<FranjaHoraria>(); 

}
