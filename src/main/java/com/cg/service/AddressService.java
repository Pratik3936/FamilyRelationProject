package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AddressDao;
import com.cg.entity.Address;
import com.cg.repository.AddressRepository;

@Service
public class AddressService implements AddressDao{
	
	@Autowired
	AddressRepository repo;

	@Override
	public String addAddress(Address address) {
		  repo.save(address);
		return "Address added ";
	}

	@Override
	public List<Address> getAllAddress() {
		
		return repo.findAll();
	}

}
