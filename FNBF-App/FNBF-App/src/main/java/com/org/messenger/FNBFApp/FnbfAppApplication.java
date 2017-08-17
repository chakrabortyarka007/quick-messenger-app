package com.org.messenger.FNBFApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FnbfAppApplication {
	
	@Value("${rate}")
	private String rateFromConfig;

	public static void main(String[] args) {
		SpringApplication.run(FnbfAppApplication.class, args);
	}
	@RequestMapping(value="/rate",method=RequestMethod.GET)
	public String getConfig() {
		System.out.println("Rate from config  " +this.rateFromConfig);
		return this.rateFromConfig;
	}
}
