package com.springboot.reddit.repository;

import com.springboot.reddit.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
}
