package com.org.messenger.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientTestController {
	
	@Value("${rate}")
	private String rateFromConfig;
	
	@RequestMapping(value="/rate",method=RequestMethod.GET)
	public String getConfig() {
		System.out.println("Rate from config  " +this.rateFromConfig);
		return this.rateFromConfig;
	}

}
