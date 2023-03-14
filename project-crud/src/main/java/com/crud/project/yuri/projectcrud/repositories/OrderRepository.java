package com.crud.project.yuri.projectcrud.repositories;

import com.crud.project.yuri.projectcrud.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository extends JpaRepository<Order, Long> {

}
