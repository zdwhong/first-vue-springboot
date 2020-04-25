package com.zdw.vue.springboot.service.impl;

import com.zdw.vue.springboot.dao.EmployeeRepository;
import com.zdw.vue.springboot.entities.Employee;
import com.zdw.vue.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Page<Employee> getListByPage(int page,int size) {
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<Employee> employeePage = employeeRepository.findAll(pageRequest);
        return employeePage;
    }
}
