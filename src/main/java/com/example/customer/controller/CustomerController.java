package com.example.customer.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.po.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public String getsample(@RequestParam String id) {
		return id;
	}
	
	@PostMapping("/cust")
	public String getsample1(@Valid @RequestBody Customer cust) {
	   // try {
	    cust.getName().toString();
	    //}
//	    catch(Exception e) {
//		return "nullErrorFRomContorller";
//	    }
	    return "dsfds";
	   
	}

}
