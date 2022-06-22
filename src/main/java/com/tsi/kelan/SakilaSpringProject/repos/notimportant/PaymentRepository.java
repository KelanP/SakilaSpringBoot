package com.tsi.kelan.SakilaSpringProject.repos.notimportant;

import com.tsi.kelan.SakilaSpringProject.entities.more.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}