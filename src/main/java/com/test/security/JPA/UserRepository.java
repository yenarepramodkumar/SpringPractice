package com.test.security.JPA;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.test.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}