package com.zdw.vue.springboot.controller;

import com.zdw.vue.springboot.entities.Employee;
import com.zdw.vue.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getListByPage/{page}/{size}")
    public Page<Employee> getListByPage(@PathVariable("page") int page,@PathVariable("size") int size){
        Page<Employee> listByPage = employeeService.getListByPage(page, size);
        //woyezhushiyihangdaima
        return listByPage;
    }
}
