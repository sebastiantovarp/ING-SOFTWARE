package com.usa.IngSoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.usa.IngSoftware.repository")
public class IngSoftwareApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(IngSoftwareApplication.class, args);
	}

}
