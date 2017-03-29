package org.cendra.bpm.model.tarea;

import java.sql.Timestamp;

import org.cendra.bpm.model.calendario.Tiempo;
import org.cendra.bpm.model.user.Usuario;

public class Checkin {

	private Usuario asignadoPor;
	private Usuario asignadoA;
	private Timestamp momentoAsignacion;
	
	private Boolean rechazada;
	private Timestamp momentoRechazo;
	private String comentarioRechazo;

	private Boolean checkin;
	private Timestamp momentoCheckin;
	private Tiempo tiempoDesdeCheckin;

	private Timestamp momentoAResolver;
	private Tiempo tiempoAResolver;
	private Double porcentajeTiempoAResolver;
	private Boolean atrasada;
	private Tiempo tiempoDesdeAtraso;

	private Timestamp momentoMaximoAResolver;
	private Tiempo tiempoMaximoAResolver;
	private Double porcentajeTiempoMaximoAResolver;

	private Boolean checkout;
	private Timestamp momentoCheckout;
	private Tiempo tiempoDesdeCheckout;
	private String comentarioCheckout;

}
