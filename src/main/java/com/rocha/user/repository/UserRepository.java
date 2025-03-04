package com.rocha.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rocha.user.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
