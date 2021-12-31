package com.myltidev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myltidev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
