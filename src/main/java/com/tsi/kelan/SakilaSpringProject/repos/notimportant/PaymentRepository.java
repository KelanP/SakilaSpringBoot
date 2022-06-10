package com.tsi.kelan.SakilaSpringProject.repos.notimportant;

import com.tsi.kelan.SakilaSpringProject.entities.notimportant.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}