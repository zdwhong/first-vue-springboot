package com.zdw.vue.springboot.service;

import com.zdw.vue.springboot.entities.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {

    //分页查询
    Page<Employee> getListByPage(int page,int size);

}
