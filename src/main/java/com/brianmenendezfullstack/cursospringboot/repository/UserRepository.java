package com.brianmenendezfullstack.cursospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brianmenendezfullstack.cursospringboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}