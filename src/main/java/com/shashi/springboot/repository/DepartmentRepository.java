package com.shashi.springboot.repository;

import com.shashi.springboot.entity.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository {
    Department save(Department department);
}
