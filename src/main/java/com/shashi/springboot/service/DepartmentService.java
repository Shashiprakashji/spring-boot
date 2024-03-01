package com.shashi.springboot.service;

import com.shashi.springboot.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {

   public Department saveDepartment(Department department);
}
