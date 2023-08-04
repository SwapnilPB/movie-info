package com.swap.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.swap.service")
public class MovieinfoApplication {
	public static void main(String[] args) {
		System.out.println("App initializes");
		SpringApplication.run(MovieinfoApplication.class, args);
		System.out.println("App initialized");
	}

}
