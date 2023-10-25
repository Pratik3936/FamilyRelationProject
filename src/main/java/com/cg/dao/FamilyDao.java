package com.cg.dao;

import java.util.List;

import com.cg.entity.Family;

public interface FamilyDao {
	
	Family saveFamily(Family family);
	Family getFamilyById(int id);
	List<Family>getAllFamilies();
	//Family updateFamily(Family family);
	Family deleteFamily(int id);

}
