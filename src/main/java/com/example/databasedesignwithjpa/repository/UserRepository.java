package com.example.databasedesignwithjpa.repository;

import com.example.databasedesignwithjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {




}
