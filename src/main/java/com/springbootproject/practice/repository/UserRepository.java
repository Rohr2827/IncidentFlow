package com.springbootproject.practice.repository;

import com.springbootproject.practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
 * Repository interface for performing database operations on the User entity.
 *
 * Extends JpaRepository to inherit common CRUD methods:
 * - save()
 * - findById()
 * - findAll()
 * - deleteById()
 *
 * Spring Data JPA automatically generates the implementation at runtime.
 */

public interface UserRepository extends JpaRepository<User, Long>
{
    /*
     * Custom query method generated automatically by Spring Data JPA.
     * Finds a user by their email address.
     *
     * @param email the email to search for
     * @return Optional containing the User if found, or empty if not
     */
    Optional<User> findByEmail(String email);
}
