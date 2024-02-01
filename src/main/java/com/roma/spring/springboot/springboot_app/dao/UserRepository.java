package com.roma.spring.springboot.springboot_app.dao;

import com.roma.spring.springboot.springboot_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
