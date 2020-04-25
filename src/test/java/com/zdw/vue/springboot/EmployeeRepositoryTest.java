package com.zdw.vue.springboot;

import com.zdw.vue.springboot.dao.EmployeeRepository;
import com.zdw.vue.springboot.entities.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void test(){
        List<Employee> employeeList = employeeRepository.findAll();
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
