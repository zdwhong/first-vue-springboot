package com.zdw.vue.springboot.dao;

import com.zdw.vue.springboot.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
