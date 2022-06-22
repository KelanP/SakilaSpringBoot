package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}