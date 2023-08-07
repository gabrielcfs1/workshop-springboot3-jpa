package com.educationweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educationweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
