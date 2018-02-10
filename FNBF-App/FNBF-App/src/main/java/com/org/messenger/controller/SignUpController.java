package com.org.messenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.messenger.entity.People;
import com.org.messenger.exceptions.SignUpException;
import com.org.messenger.service.ISignUpService;

@RestController
public class SignUpController {
	
	@Autowired
	ISignUpService signUpService;
	
	@RequestMapping(value="/signup",method=RequestMethod.POST,consumes={"application/json"})
	public void signUp(@RequestParam(required=true) People people) throws SignUpException{
		signUpService.signUp(people);
	}

}
