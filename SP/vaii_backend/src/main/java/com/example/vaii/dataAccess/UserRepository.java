package com.example.vaii.dataAccess;

import com.example.vaii.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User1, Long> {
    Optional<User1> findUserByUsername(String username);
    void deleteUser1ByUserID(UUID id);
}