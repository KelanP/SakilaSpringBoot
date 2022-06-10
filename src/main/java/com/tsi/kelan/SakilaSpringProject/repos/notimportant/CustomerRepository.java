package com.tsi.kelan.SakilaSpringProject.repos.notimportant;

import com.tsi.kelan.SakilaSpringProject.entities.notimportant.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}