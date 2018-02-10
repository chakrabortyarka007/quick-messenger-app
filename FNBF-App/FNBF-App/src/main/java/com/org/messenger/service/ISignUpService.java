package com.org.messenger.service;

import com.org.messenger.entity.People;
import com.org.messenger.exceptions.SignUpException;

public interface ISignUpService {
	
	public String signUp(People people) throws SignUpException;
	
}
