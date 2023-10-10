package com.example.server.repository;

import com.example.server.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Member,Long> {
}
