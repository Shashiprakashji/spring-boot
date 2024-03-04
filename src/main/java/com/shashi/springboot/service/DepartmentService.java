package com.shashi.springboot.service;

import com.shashi.springboot.entity.Department;
import org.springframework.stereotype.Service;

//it is an interface where methofds are there.
@Service
public interface DepartmentService {

   public Department saveDepartment(Department department);
}
