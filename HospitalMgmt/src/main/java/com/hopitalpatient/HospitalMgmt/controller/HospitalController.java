package com.hopitalpatient.HospitalMgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hopitalpatient.HospitalMgmt.dao.HospitalDao;
import com.hopitalpatient.HospitalMgmt.entity.Hospital;
import com.hopitalpatient.HospitalMgmt.service.HospitalService;

@RestController
//@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/addHospital")
	public Hospital saveHospital(@RequestBody Hospital h) {
		
		return hospitalService.saveHospital(h);
	}
	
	@GetMapping("/findHospital/{id}")
	public Hospital findByHospitalId(@PathVariable int id) {
		return hospitalService.findByHospitalId(id);
	}
	
	@PutMapping("/update/{id}")
	public Hospital updateById(@PathVariable int id,@RequestBody Hospital h) {
		return hospitalService.update(id, h);
	}
	
	@GetMapping("/all")
	public List<Hospital> findByAllId() {
		return hospitalService.findByAllId();
	}
}
