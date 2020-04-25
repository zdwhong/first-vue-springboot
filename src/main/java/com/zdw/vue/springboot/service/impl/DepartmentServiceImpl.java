package com.zdw.vue.springboot.service.impl;

import com.zdw.vue.springboot.dao.DepartmentRepository;
import com.zdw.vue.springboot.entities.Department;
import com.zdw.vue.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Page<Department> getListByPage(int page, int size) {
        PageRequest pageRequest = PageRequest.of(page,size);
        Page<Department> employeePage = departmentRepository.findAll(pageRequest);
        return employeePage;
    }
}
