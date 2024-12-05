package com.mesbah.springSecurity.repository;

import com.mesbah.springSecurity.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    //we are telling the spring data JPA framework, whatever methods we gonna write inside this customerRepository,
    //they have to be executed against the table Customer and the Data type of the primary key column inside this Customer table is long
    List<Customer> findByEmail(String email);
}
