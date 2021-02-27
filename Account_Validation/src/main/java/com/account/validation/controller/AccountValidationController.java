package com.account.validation.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.validation.model.AccountValidation;

@RestController
@RequestMapping(value= "/account", consumes = "application/json", produces = "application/json")
public class AccountValidationController {

@PostMapping("/validate")
public Map<String,String> validateAccount(@RequestBody AccountValidation account) {
	
	Map<String, String > kv  = new HashMap<>();
	String isValid = "inactive";
	int dnumber = account.getDebtorAccountNumber();
	
	if (dnumber > 0 && dnumber<100)
	{ 
		isValid ="active";
		
	}
	
	kv.put("AccountStatus",isValid);
	return kv;
	}

}
