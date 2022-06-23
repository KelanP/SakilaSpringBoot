package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}