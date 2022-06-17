package com.example.demo.repository;

import com.example.demo.Model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount,Integer> {
}
