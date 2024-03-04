package com.shashi.springboot.service;

import com.shashi.springboot.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

//it is an interface where methofds are there.
@Service
public interface DepartmentService {
   public Department saveDepartment(Department department);


   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
