package com.prueba.gestionarTareaAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.prueba.gestionarTareaAPI.infrastructure.entities.*") // <-- Add this
public class GestionarTareaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionarTareaApiApplication.class, args);
	}

}
