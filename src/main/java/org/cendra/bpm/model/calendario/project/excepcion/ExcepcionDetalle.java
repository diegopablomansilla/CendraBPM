package org.cendra.bpm.model.calendario.project.excepcion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.cendra.bpm.model.calendario.project.FranjaHoraria;

public class ExcepcionDetalle {

	private Boolean noLaborable;
	private List<FranjaHoraria> franjasHorarias = new ArrayList<FranjaHoraria>();

	private Integer patronRepeticion;
	private Integer tipoPatronRepeticion; // Diario | Semanal | Mensual | Anual
	
	private Date comienzoIntervaloRepeticion;
	private Date finIntervaloRepeticion;
	private Date terminarDespuesDeXVeces; // finIntervaloRepeticion tiene que ser null

}
