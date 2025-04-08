package com.hopitalpatient.HospitalMgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hopitalpatient.HospitalMgmt.entity.Hospital;
import com.hopitalpatient.HospitalMgmt.repository.HospitalRepository;

@Repository
public class HospitalDao {

	@Autowired
	HospitalRepository hospitalJpaRepo;
	
	public Hospital saveHospital(Hospital h) {
		return hospitalJpaRepo.save(h);
	}
	
	public Hospital findByHospitalId(int id) {
		Optional<Hospital> option = hospitalJpaRepo.findById(id);
			return option.isPresent()?option.get():null;
		
	}
	

	public Hospital update(Hospital h) {
		return hospitalJpaRepo.save(h);
}
	
	
	public List<Hospital> findAllHospital(){
		return hospitalJpaRepo.findAll();
	}
}