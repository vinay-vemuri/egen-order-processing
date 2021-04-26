package com.ecommerce.orderprocessing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.orderprocessing.tables.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

}
