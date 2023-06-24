package com.employee_management_backend.Employee_management_backend.Repository;

import com.employee_management_backend.Employee_management_backend.Entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends CrudRepository<Employee,String> {
}
