package com.demo.appweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppwebApplication.class, args);
		System.out.println("Hola Mundo");
	}

}
