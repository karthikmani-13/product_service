package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.User;

//public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByUsername(String username);
//    boolean existsByUsername(String username);
	public interface UserRepository extends JpaRepository<User, Long> {

//	    User findByEmail(String email);

	}



