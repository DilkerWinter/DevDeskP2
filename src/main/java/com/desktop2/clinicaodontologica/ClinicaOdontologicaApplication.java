package com.desktop2.clinicaodontologica;

import com.desktop2.clinicaodontologica.Controller.PacienteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaOdontologicaApplication implements CommandLineRunner {

	@Autowired
	private PacienteController pacienteController;

	public static void main(String[] args) {
		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
