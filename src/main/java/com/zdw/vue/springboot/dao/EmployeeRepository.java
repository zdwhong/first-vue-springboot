package com.zdw.vue.springboot.dao;

import com.zdw.vue.springboot.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
