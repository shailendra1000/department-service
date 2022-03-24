package com.salen.department.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salen.department.entity.Department;
import com.salen.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private DepartmentRepository repository;

	public Department saveDepartment(Department department) {

		return repository.save(department);

	}

	public Department findDepartmentById(Long id) {
		
		 
		return repository.findByDepartmentId(id);
	}

	
	

}
