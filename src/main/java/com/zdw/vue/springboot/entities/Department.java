package com.zdw.vue.springboot.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_dept")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    private Integer id;
    @Column(name = "dept_name")
    private String departmentName;
}
