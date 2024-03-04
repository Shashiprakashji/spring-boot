package com.shashi.springboot.controller;


import com.shashi.springboot.entity.Department;
import com.shashi.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//this is for controlling the webpage by writing '/' in the webpage link.
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }
@GetMapping("/departments")
public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();

}
@GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
}
@DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully";
}

@PutMapping("/departments/{id}")
public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
}
}
