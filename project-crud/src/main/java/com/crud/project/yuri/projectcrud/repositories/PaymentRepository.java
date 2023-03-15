package com.crud.project.yuri.projectcrud.repositories;

import com.crud.project.yuri.projectcrud.entites.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
