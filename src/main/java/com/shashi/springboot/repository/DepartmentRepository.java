package com.shashi.springboot.repository;

import com.shashi.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
public Department findByDepartmentName(String DepartmentName);
//now ignore the capitala and small letter of name
public Department findByDepartmentNameIgnoreCase(String DepartmentName);
}
