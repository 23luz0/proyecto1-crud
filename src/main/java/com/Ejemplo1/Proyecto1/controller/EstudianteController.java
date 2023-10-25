package com.Ejemplo1.Proyecto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ejemplo1.Proyecto1.entity.Estudiante;
import com.Ejemplo1.Proyecto1.service.EstudianteService;

@Controller
public class EstudianteController {
	@Autowired
	private EstudianteService service;

	@GetMapping({ "/estudiantes", "/" })
	public String listarEstudiantes(Model modelo) {
		modelo.addAttribute("estudiantes", service.listarTodosLosEstudiantes());
		return "estudiantes";
	}

	@GetMapping("/estudiantes/nuevo")
	public String mostrarFormularioDeRegistrarEstudiante(Model modelo) {
		Estudiante estudiante = new Estudiante();
		modelo.addAttribute("estudiante", estudiante);
		return "crear_estudiante";

	}

	@PostMapping("/estudiantes")
	public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
		service.guardarEstudiante(estudiante);
		return "redirect:estudiantes";
	}

	@GetMapping("/estudiantes/editar/{Id}")
	public String mostrarFormularioDeEditar(@PathVariable Long Id, Model modelo) {
		modelo.addAttribute("estudiante", service.obtenerEstudiantePorId(Id));
		return "editar_estudiante";

	}

	@PostMapping("/estudiantes/{Id}")
	public String actualizarEstudiante(@PathVariable Long Id, @ModelAttribute("estudiante") Estudiante estudiante,
			Model modelo) {
		Estudiante estudianteExistente = service.obtenerEstudiantePorId(Id);
		estudianteExistente.setId(Id);
		estudianteExistente.setNombre(estudiante.getNombre());
		estudianteExistente.setApellido(estudiante.getApellido());
		estudianteExistente.setEmail(estudiante.getEmail());

		service.actualizarEstudiante(estudianteExistente);
		return "redirect:/estudiantes";
	}

	@GetMapping("/estudiantes/{Id}")
	public String eliminarEstudiante(@PathVariable Long Id) {
		service.eliminarEstudiante(Id);
		return "redirect:/estudiantes";

	}

}
