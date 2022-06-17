package com.example.demo.controller;

import com.example.demo.Model.Beneficiary;
import com.example.demo.repository.BeneficiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/beneficiary")
public class BeneficiaryController {

    @Autowired
    BeneficiaryRepository beneficiaryRepository;

    @GetMapping(value = "/all")
    public List<Beneficiary> getAll(){
        return beneficiaryRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<Beneficiary> persist(@RequestBody Beneficiary beneficiary){
        beneficiaryRepository.save(beneficiary);
        return beneficiaryRepository.findAll();
    }
}
