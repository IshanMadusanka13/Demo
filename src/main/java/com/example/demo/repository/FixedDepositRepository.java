package com.example.demo.repository;

import com.example.demo.Model.FixedDeposit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FixedDepositRepository extends JpaRepository<FixedDeposit,Integer> {
}
