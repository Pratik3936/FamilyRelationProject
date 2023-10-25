package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.FamilyDao;
import com.cg.entity.Family;
import com.cg.repository.FamilyRepository;

@Service
public class FamilyInfo implements FamilyDao {

	@Autowired
	FamilyRepository repo;

	@Override
	public Family saveFamily(Family family) {

		return repo.save(family);
	}

	@Override
	public Family getFamilyById(int id) {

		return repo.getById(id);
	}

	@Override
	public List<Family> getAllFamilies() {

		return repo.findAll();
	}

	@Override
	public Family updateFamily(Family family) {
		Family existingfamily = repo.getById(family.getFamilyId());
		existingfamily.setFamilyName(family.getFamilyName());
		return repo.save(existingfamily);
	}

	@Override
	public Family deleteFamily(int id) {
		repo.deleteById(id);
		return null;
	}

}
