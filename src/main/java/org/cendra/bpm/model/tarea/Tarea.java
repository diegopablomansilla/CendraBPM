package org.cendra.bpm.model.tarea;

import java.util.ArrayList;
import java.util.List;

import org.cendra.bpm.model.user.Usuario;

// ESTADO
// - CREADA
// - PLANIFICADA cuando tiene fecha de inicio
// - PLANIFICADA_EN_COLA cuando tiene stakeholders
// - PLANIFICADA_ASIGNADA cuando tiene planificado el ejecutor planificado
// - EN_EJECUCION (TOMADA p CHECKIN) cuando el ejecutor la tomo
// - RESUELTA
// - CANCELADA

// URGENCIA
// - NO URGENTE
// - ATRASADA
// - MUY ATRASADA
// - INMEDIATA

public class Tarea {

	private TipoTarea tipo;
	private String codigo;
	private String tituloCorto;
	private String titulo;
	private String asunto;
	private String mensaje;

	private Usuario creadoPor;

	private TiemposYMomentos tiemposYMomentos;

	private Checkin checkin;
	
	private List<Checkin> historialCheckin = new ArrayList<Checkin>();
	
	private Resultado resultado;

}
