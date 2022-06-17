package com.example.demo.controller;

import com.example.demo.Model.Customer;
import com.example.demo.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<Customer> persist(@RequestBody Customer customer){

        customerRepository.save(customer);
        return customerRepository.findAll();
    }
}
