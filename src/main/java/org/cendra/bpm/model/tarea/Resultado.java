package org.cendra.bpm.model.tarea;

import java.sql.Timestamp;

import org.cendra.bpm.model.calendario.Tiempo;
import org.cendra.bpm.model.user.Usuario;

public class Resultado {
	
	private Boolean resuelta;
	private Usuario resueltaPor;
	private Timestamp momentoResolucion;
	private Tiempo tiempoDesdeResolucion;
	
	private Boolean cancelada;
	private Usuario canceladaPor;
	private Timestamp momentoCancelacion;
	private Tiempo tiempoDesdeCancelacion;

}
