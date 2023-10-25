package com.Ejemplo1.Proyecto1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Ejemplo1.Proyecto1.entity.Estudiante;
import com.Ejemplo1.Proyecto1.repository.EstudianteRepository;

@SpringBootApplication
public class Proyecto1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);
	}

	
	@Autowired
	private EstudianteRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1 = new Estudiante("Anna", "Suarez", "anna65@gmail.com");
		repository.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Erick", "Velez", "erick87@gmail.com");
		repository.save(estudiante2);
		*/
	}

}
