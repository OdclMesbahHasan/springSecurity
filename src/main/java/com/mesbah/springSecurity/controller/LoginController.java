package com.mesbah.springSecurity.controller;

import com.mesbah.springSecurity.model.Customer;
import com.mesbah.springSecurity.model.Employee;
import com.mesbah.springSecurity.repository.CustomerRepository;
import com.mesbah.springSecurity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
        Customer savedCustomer = null;
        ResponseEntity<String> response = null;
        try {
            savedCustomer = customerRepository.save(customer);
            if (savedCustomer.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Customer successfully registered!");
            }
        }
        catch (Exception e) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An Exception occured due to:" + e.getMessage());
        }

        return response;
    }

    @PostMapping("/registerEmployee")
    public ResponseEntity<String> registerEmployee(@RequestBody Employee employee) {
        ResponseEntity<String> response = null;
        Employee savedEmployee = null;
        try {
            savedEmployee = employeeRepository.save(employee);

            if (savedEmployee.getId() > 0) {
                response = ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body("Employee successfully registered!");
            }
        }
        catch (Exception e) {
            response = ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An Exception occured due to:" + e.getMessage());
        }
        return response;
    }
}
