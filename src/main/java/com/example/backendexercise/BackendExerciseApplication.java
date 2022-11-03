package com.example.backendexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BackendExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendExerciseApplication.class, args);
	}

}
