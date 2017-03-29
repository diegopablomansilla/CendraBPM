package org.cendra.bpm.model.tarea;

import java.sql.Timestamp;

import org.cendra.bpm.model.calendario.Calendario;
import org.cendra.bpm.model.calendario.Tiempo;

public class TiemposYMomentos {
	
	private Calendario calendarioPorDefecto;

	private Tiempo tiempoEstimado;
	private Tiempo tiempoEstimadoMaximo;
	private Tiempo tiempoEstimadoVencimiento;

	private Timestamp momentoCreacion;
	private Tiempo tiempoDesdeCreacion;

	private Timestamp momentoActual;
	private Timestamp momentoInicioPlanificado;

	private Tiempo tiempoDesdeInicio;

	private Timestamp momentoVencimiento;
	private Tiempo tiempoAVencer;

	private Double porcentajeTiempoVencimiento;
	private Boolean vencida;
	private Tiempo tiempoDesdeVencimiento;
	
	private Timestamp hitoAtrasada;
	private Timestamp hitoMuyAtrasada;
	private Timestamp hitoInmediata;

}
