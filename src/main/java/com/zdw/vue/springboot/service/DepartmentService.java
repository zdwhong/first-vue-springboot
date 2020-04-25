package com.zdw.vue.springboot.service;

import com.zdw.vue.springboot.entities.Department;
import org.springframework.data.domain.Page;

public interface DepartmentService {
    //分页查询
    Page<Department> getListByPage(int page, int size);
}
