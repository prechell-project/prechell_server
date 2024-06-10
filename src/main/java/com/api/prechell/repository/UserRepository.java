package com.api.prechell.repository;

import com.api.prechell.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Boolean existsByUserName(String username);

    User findByUserName(String username);
}
