package com.zdw.vue.springboot.controller;

import com.zdw.vue.springboot.entities.Department;
import com.zdw.vue.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("getListByPage/{page}/{size}")
    public Page<Department> getListByPage(@PathVariable("page") int page, @PathVariable("size") int size){
        Page<Department> listByPage = departmentService.getListByPage(page, size);
        //这里页加上一行
        return listByPage;
    }
}
