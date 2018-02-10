package com.org.messenger.FNBFApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import com.org.messenger.service.ISignUpService;
import com.org.messenger.service.SignUpService;


@SpringBootApplication
@ComponentScan(basePackages={"com.org.messenger.*"})
@EnableNeo4jRepositories
public class FnbfAppApplication {
	
	@Bean
	public ISignUpService getSignUp(){
		return new SignUpService();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FnbfAppApplication.class, args);
	}
}
