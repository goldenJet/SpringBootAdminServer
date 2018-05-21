package com.example.demo;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminDemoApplication.class, args);
	}
}
