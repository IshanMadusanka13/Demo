package com.example.demo.controller;

import com.example.demo.Model.FixedDeposit;
import com.example.demo.repository.FixedDepositRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/fixeddeposit")
public class FixedDepositController {

    @Autowired
    FixedDepositRepository fixedDepositRepository;

    @GetMapping(value = "/all")
    public List<FixedDeposit> getAll(){
        return fixedDepositRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<FixedDeposit> persist(@RequestBody FixedDeposit fixedDeposit){
        fixedDepositRepository.save(fixedDeposit);
        return fixedDepositRepository.findAll();
    }

}
