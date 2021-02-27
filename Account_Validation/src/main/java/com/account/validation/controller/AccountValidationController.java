package com.account.validation.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.validation.model.AccountValidation;
import com.account.validation.repository.AccountRepository;

@RestController
@RequestMapping(value= "/account", consumes = "application/json", produces = "application/json")
public class AccountValidationController {

@Autowired
private AccountRepository repo;
	
@PostMapping("/validate")
public Map<String,String> validateAccount(@RequestBody AccountValidation account) {
	
	Map<String, String > kv  = new HashMap<>();
	String isValid = "inactive";
	String dnumber = account.getDebtorAccountNumber();
	
	if (repo.findById(dnumber).isPresent())
	{ 
		isValid ="active";
		
	}
	
	kv.put("AccountStatus",isValid);
	return kv;
	}
@PostMapping("/insert")
public String insert(@RequestBody AccountValidation account) {
	repo.save(account);
	return "saved";
}

@GetMapping("/check")
public List<AccountValidation> getDetails() {
	List<AccountValidation> li = repo.findAll();
	return li;
}
}
