package com.csa.samplefullstack.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
    private String name;
    private String department;
    private String location;

    public Employee(Long employee_id, String name, String department, String location) {
        this.employee_id = employee_id;
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public Employee() {
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
