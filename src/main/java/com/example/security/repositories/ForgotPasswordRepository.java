package com.example.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.ForgotPassword;

@Repository
public interface ForgotPasswordRepository extends JpaRepository<ForgotPassword, Long> {

	ForgotPassword findByToken(String token);

}
