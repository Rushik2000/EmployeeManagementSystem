package com.employee_management_backend.Employee_management_backend.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private String employeeId;
    private String name;
    private String salary;
}
