package com.example.demo_desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoDesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDesafioApplication.class, args);
	}

}
