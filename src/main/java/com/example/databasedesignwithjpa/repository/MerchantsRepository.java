package com.example.databasedesignwithjpa.repository;

import com.example.databasedesignwithjpa.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantsRepository extends JpaRepository<Merchant,Long> {

}
