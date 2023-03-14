package com.crud.project.yuri.projectcrud.repositories;

import com.crud.project.yuri.projectcrud.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
