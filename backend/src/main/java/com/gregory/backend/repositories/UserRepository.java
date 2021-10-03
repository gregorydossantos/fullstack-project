package com.gregory.backend.repositories;

import com.gregory.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT * FROM User WHERE name = ?1")
    User getUserByName(String name);

}
