package com.tecdesoftware.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MarketApp3cApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketApp3cApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void printSwaggerUrl() {
		System.out.println("\n===============================================");
		System.out.println("Swagger UI disponible en:");
		System.out.println("http://localhost:8090/market-app/api/swagger-ui/index.html");
		System.out.println("===============================================\n");
	}
}