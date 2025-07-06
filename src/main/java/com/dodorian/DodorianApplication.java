package com.dodorian;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@RequiredArgsConstructor
public class DodorianApplication {
	public static void main(String[] args) {
		SpringApplication.run(DodorianApplication.class, args);
	}

}
