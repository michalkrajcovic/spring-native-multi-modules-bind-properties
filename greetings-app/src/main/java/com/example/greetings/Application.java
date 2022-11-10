package com.example.greetings;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(GreetingsProperties.class)
public class Application implements CommandLineRunner {

	private final GreetingsProperties greetingsProperties;

	public Application(GreetingsProperties greetingsProperties) {
		this.greetingsProperties = greetingsProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(greetingsProperties.getSalute());
	}
}
