package com.hopitalpatient.HospitalMgmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hopitalpatient.HospitalMgmt.entity.Branch;
import com.hopitalpatient.HospitalMgmt.entity.Hospital;
import com.hopitalpatient.HospitalMgmt.service.BranchService;


@RestController
public class BranchController {
	
	@Autowired
	BranchService branchService;
	
	@PostMapping("/addBranch/{id}")
	public Branch saveBranch(@RequestBody Branch b,@PathVariable int id) {
		
		return branchService.saveBranch(id,b);
	}

	@GetMapping("/findBranch/{id}")
	public Branch finByBranchId(@PathVariable int id) {
		return branchService.findByBranchId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		branchService.deleteById(id);
	}

	@PutMapping("/updateBranch/{id}")
	public Branch updateById(@PathVariable int id,@RequestBody Branch b) {
		return branchService.update(id, b);
	}
}
