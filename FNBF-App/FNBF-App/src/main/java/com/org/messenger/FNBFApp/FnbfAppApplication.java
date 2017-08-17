package com.org.messenger.FNBFApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.org.messenger.*"})
public class FnbfAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FnbfAppApplication.class, args);
	}
}
