package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int laneNo;
	
	@Column(name="FamilyAddress")
	private String address;

	public Address(int laneNo, String address) {
		super();
		this.laneNo = laneNo;
		this.address = address;
	}

	public Address() {
		super();
	}

	public int getLaneNo() {
		return laneNo;
	}

	public void setLaneNo(int laneNo) {
		this.laneNo = laneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [laneNo=" + laneNo + ", address=" + address + "]";
	}
	
	
	
	
}
