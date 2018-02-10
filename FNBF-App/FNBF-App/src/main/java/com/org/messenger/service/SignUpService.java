package com.org.messenger.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.messenger.entity.People;
import com.org.messenger.exceptions.SignUpException;
import com.org.messenger.validator.SignUpDataValidator;


public class SignUpService implements ISignUpService{
	
	@Autowired
	SignUpDataValidator signUpDataValidator;
	
	public String signUp(People people) throws SignUpException{
		if(signUpDataValidator.validateSignUpData(people)){
			return "";
		}
		else{
			throw new SignUpException();
		}
	}
	
}
