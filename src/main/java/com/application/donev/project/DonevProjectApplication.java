package com.application.donev.project;

import com.application.donev.project.infra.DotenvLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonevProjectApplication {

	public static void main(String[] args) {
		DotenvLoader.load();
		SpringApplication.run(DonevProjectApplication.class, args);
	}

}
