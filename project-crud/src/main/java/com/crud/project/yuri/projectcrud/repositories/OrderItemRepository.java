package com.crud.project.yuri.projectcrud.repositories;

import com.crud.project.yuri.projectcrud.entites.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
