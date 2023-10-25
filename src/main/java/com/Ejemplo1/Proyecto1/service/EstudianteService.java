package com.Ejemplo1.Proyecto1.service;

import java.util.List;

import com.Ejemplo1.Proyecto1.entity.Estudiante;

public interface EstudianteService {
	
	public List<Estudiante> listarTodosLosEstudiantes();
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long Id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long Id);

}
