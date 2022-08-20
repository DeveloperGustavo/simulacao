package com.api.simulacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimulacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulacaoApplication.class, args);
	}
}
