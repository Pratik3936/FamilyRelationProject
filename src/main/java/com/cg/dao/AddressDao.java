package com.cg.dao;

import java.util.List;

import com.cg.entity.Address;

public interface AddressDao {
	
	public String addAddress(Address address);
	List<Address>getAllAddress();

}
