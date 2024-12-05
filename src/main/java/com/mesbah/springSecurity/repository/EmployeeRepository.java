package com.mesbah.springSecurity.repository;

import com.mesbah.springSecurity.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
