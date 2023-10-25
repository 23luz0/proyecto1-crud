package com.Ejemplo1.Proyecto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ejemplo1.Proyecto1.entity.Estudiante;
import com.Ejemplo1.Proyecto1.repository.EstudianteRepository;

@Service
public class EstudianteServiceImp implements EstudianteService {

	@Autowired
	private EstudianteRepository repository;

	@Override
	public List<Estudiante> listarTodosLosEstudiantes() {
		return repository.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repository.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(Long Id) {
		return repository.findById(Id).get();
	}

	@Override
	public Estudiante actualizarEstudiante(Estudiante estudiante) {
		return repository.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long Id) {
		repository.deleteById(Id);

	}

}
