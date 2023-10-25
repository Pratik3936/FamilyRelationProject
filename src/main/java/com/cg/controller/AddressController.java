package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Address;
import com.cg.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	AddressService service;
	
	@PostMapping("/add")
	public String  addAddress(@RequestBody Address address) {
		 
		 return service.addAddress(address);
	}
	
	@GetMapping("/getall")
	List<Address>getAll(){
		
		return service.getAllAddress();
		
	}

}
