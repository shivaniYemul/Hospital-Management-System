package com.hopitalpatient.HospitalMgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hopitalpatient.HospitalMgmt.controller.HospitalController;
import com.hopitalpatient.HospitalMgmt.dao.HospitalDao;
import com.hopitalpatient.HospitalMgmt.entity.Hospital;

@Service
public class HospitalService {
	
	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveHospital( Hospital h) {
		
		return hospitalDao.saveHospital(h);
	}
	
	public Hospital findByHospitalId(int id) {
		return hospitalDao.findByHospitalId(id);
		
	}
	
	public Hospital update(int id,Hospital h) {
		Hospital h1=findByHospitalId(id);
		if(h1!=null) {
			h1.setName(h.getName());
			return hospitalDao.update(h1);
		}
		return hospitalDao.update(h);
	}
	
	public List<Hospital> findByAllId() {
		return hospitalDao.findAllHospital();
	}
}
