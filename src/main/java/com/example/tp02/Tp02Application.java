package com.example.tp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"service","controller"})

public class Tp02Application {
	public static void main(String[] args) {
		SpringApplication.run(Tp02Application.class, args);
	}
}