package org.cendra.bpm.model.calendario.google;

import java.util.ArrayList;
import java.util.List;

import org.cendra.bpm.model.calendario.project.semana_laboral.SemanaLaboral;

public class Calendario {
	
	private List<Calendario> calendariosExtenidos = new ArrayList<Calendario>();
	
	private String nombre;
	private String descripcion;
	
	
	private Idioma idioma;
	private String paisZonaHoraria; // ISO 2
	private List<String> zonasHorarias = new ArrayList<String>(); // GMT-03:00 Buenos Aires
	private String formatoFecha;
	private Boolean formatoHora24;
	private Integer duracionPredeterminadaEvento = 60; // minutos
	private Integer laSemanaEmpiezaEl = 1;
	private List<SemanaLaboral> semanasLaborables = new ArrayList<SemanaLaboral>();
	private String ubicacion; // por ej., Aravaca (Madrid) o 28023
	
	 
	
	
	
//	private Integer comienzoSemanaLaboral = 1;
//	private Integer comienzoAnioFizcal = 1;
//	private String horaComienzoPredeterminado = "9:00";
//	private String horaFinPredeterminado = "19:00";
//	private Integer horasJornadaLaboral = 8; // hs
//	private Integer horasSemanaLaboral = 40; // hs
//	private Integer diasPorMes = 20; 
//	
//	private List<Excepcion> excepciones = new ArrayList<Excepcion>();
//	private List<SemanaLaboral> semanasLaborables = new ArrayList<SemanaLaboral>();
	

}
