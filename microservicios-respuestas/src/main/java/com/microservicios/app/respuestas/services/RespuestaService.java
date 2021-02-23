package com.microservicios.app.respuestas.services;

import com.microservicios.app.respuestas.models.entity.Respuesta;

public interface RespuestaService {
	
public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);

public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId);

public Iterable<Long> findExamenesIdsRespondidoByAlumno(Long alumnoId);
}
