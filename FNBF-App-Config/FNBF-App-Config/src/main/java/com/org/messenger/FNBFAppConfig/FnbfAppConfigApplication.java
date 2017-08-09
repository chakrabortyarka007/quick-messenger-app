package com.org.messenger.FNBFAppConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FnbfAppConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(FnbfAppConfigApplication.class, args);
	}
}
