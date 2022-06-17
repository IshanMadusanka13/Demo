package com.example.demo.controller;

import com.example.demo.Model.SavingsAccount;
import com.example.demo.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/savingsaccount")
public class SavingsAccountController {

    @Autowired
    SavingsAccountRepository savingsAccountRepository;

    @GetMapping(value = "/all")
    public List<SavingsAccount> getAll(){
        return savingsAccountRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<SavingsAccount> persist(@RequestBody SavingsAccount savingsAccount){
        savingsAccountRepository.save(savingsAccount);
        return savingsAccountRepository.findAll();
    }

}
