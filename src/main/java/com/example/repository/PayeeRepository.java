package com.example.repository;

import com.example.model.Payee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayeeRepository extends JpaRepository<Payee, Integer> {
    Payee findByName(String name);
}
