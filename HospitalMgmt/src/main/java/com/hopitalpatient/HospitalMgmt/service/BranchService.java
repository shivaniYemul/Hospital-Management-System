package com.hopitalpatient.HospitalMgmt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopitalpatient.HospitalMgmt.dao.BranchDao;
import com.hopitalpatient.HospitalMgmt.dao.HospitalDao;
import com.hopitalpatient.HospitalMgmt.entity.Branch;
import com.hopitalpatient.HospitalMgmt.entity.Hospital;


@Service
public class BranchService {
	
	@Autowired
	BranchDao branchDao;
	HospitalDao hospitalDao;
	public Branch saveBranch(int id,Branch b) {
		Hospital h=hospitalDao.findByHospitalId(id);
		if(h.getBranch()!=null) {
			h.getBranch().add(b);
			return branchDao.saveBranch(b);
		}
		else {
			ArrayList al=new ArrayList();
			al.add(b);
			h.setBranch(al);
		}
		hospitalDao.saveHospital(h);
		return b;
	}

	public Branch findByBranchId(int id) {
		return branchDao.findByBranchId(id);
		
	}
	
	public void deleteById(int id) {
	List<Hospital> li=hospitalDao.findAllHospital();
	
	for(Hospital hos:li) {
	
		if(hos.getBranch().removeIf(branch->branch.getId()==id));

		
	  }
	branchDao.deleteById(id);
	
	}
	public Branch update(int id, Branch b) {
		Branch b1=findByBranchId(id);
		if(b1!=null) {
			b1.setName(b.getName());
			return branchDao.saveBranch(b1);			
		}
		return branchDao.update(b);
	}

	


}
