package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Family {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int familyId;
	
	@Column(name="FamilyName")
	private String familyName;
	
	@Column(name="FamilyMembers")
	private int noOfmembers;

	public Family(int familyId, String familyName, int noOfmembers) {
		super();
		this.familyId = familyId;
		this.familyName = familyName;
		this.noOfmembers = noOfmembers;
	}

	public Family() {
		super();
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getNoOfmembers() {
		return noOfmembers;
	}

	public void setNoOfmembers(int noOfmembers) {
		this.noOfmembers = noOfmembers;
	}

	@Override
	public String toString() {
		return "Family [familyId=" + familyId + ", familyName=" + familyName + ", noOfmembers=" + noOfmembers + "]";
	}
	
	
	
	

}
