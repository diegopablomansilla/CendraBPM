package org.cendra.bpm.model.calendario.project;

import java.util.ArrayList;
import java.util.List;

import org.cendra.bpm.model.calendario.project.excepcion.Excepcion;
import org.cendra.bpm.model.calendario.project.semana_laboral.SemanaLaboral;

public class Calendario {
	
	private List<Calendario> calendariosExtenidos = new ArrayList<Calendario>();
	private String nombre;
	
	private Integer comienzoSemanaLaboral = 1;
	private Integer comienzoAnioFizcal = 1;
	private String horaComienzoPredeterminado = "9:00";
	private String horaFinPredeterminado = "19:00";
	private Integer horasJornadaLaboral = 8; // hs
	private Integer horasSemanaLaboral = 40; // hs
	private Integer diasPorMes = 20; 
	
	private List<Excepcion> excepciones = new ArrayList<Excepcion>();
	private List<SemanaLaboral> semanasLaborables = new ArrayList<SemanaLaboral>();
	

}
