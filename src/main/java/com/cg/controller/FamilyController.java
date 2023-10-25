package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Family;
import com.cg.service.FamilyInfo;

@RestController
public class FamilyController {

	@Autowired
	FamilyInfo service;

	@PostMapping("/add")
	public Family saveFamily(@RequestBody Family family) {

		return service.saveFamily(family);
	}

	@GetMapping("/get/{id}")
	public Family getFamilyById(@PathVariable int id) {

		return service.getFamilyById(id);
	}

	@GetMapping("/getall")
	public List<Family> getAllFamily() {

		return service.getAllFamilies();
	}

	// @PutMapping("/update")
	// public Family updateFamily(@RequestBody int id) {

	// return service.updateFamily(Family family);

	// }

	public Family deleteFamily(int id) {

		return service.deleteFamily(id);
	}

}
