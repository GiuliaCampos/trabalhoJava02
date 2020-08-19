package com.example.tp02;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Tp02Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp02Application.class, args);
	}
	@GetMapping("/")
	public String hello() {
		String var =  "https://blogfilme.herokuapp.com/swagger-ui.html para ver a documentação";
		return var;
	}
}