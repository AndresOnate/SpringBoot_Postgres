package com.edu.eci.ieti.data.repository;

import com.edu.eci.ieti.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}