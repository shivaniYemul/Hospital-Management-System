package com.hopitalpatient.HospitalMgmt.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hopitalpatient.HospitalMgmt.entity.Branch;
import com.hopitalpatient.HospitalMgmt.entity.Hospital;
import com.hopitalpatient.HospitalMgmt.repository.BranchRepository;
import com.hopitalpatient.HospitalMgmt.repository.HospitalRepository;


@Repository
public class BranchDao {
	
	@Autowired
	BranchRepository branchJpaRepo;
	
	@Autowired
	HospitalRepository hospitalJpaRepo;
	
	public Branch saveBranch(Branch b) {
		return branchJpaRepo.save(b);
	}

	public Branch findByBranchId(int id) {
		Optional<Branch> option = branchJpaRepo.findById(id);
		return option.isPresent()?option.get():null;
	}

	
	public boolean deleteById(int id) {
		Branch b=findByBranchId(id);
		if(b!=null) {
		
		branchJpaRepo.deleteById(id);
		return true;
		}
		else {
			return false;
		}
		
	}
	public Branch update(Branch b) {
		return branchJpaRepo.save(b);
}
	
}
