package com.employee_management_backend.Employee_management_backend.Controller;

import com.employee_management_backend.Employee_management_backend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;



}
