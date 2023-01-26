package com.render.ferm.org.user;

import java.util.Optional;

import com.render.ferm.org.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findByEmail(String email);

}
