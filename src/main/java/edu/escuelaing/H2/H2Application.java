package edu.escuelaing.H2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "edu.escuelaing.H2.model")
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}

}
