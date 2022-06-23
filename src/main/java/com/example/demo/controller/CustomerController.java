package com.example.demo.controller;

import com.example.demo.Model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }


    @GetMapping(value = "/search/{nic}")
    public Customer getByNic(@PathVariable(value = "nic") String nic) {
        Customer c= customerRepository.findByNic(nic);
        if (c==null){
            throw new NoSuchElementException("No Customer Found with the NIC : "+nic);
        }else{
            return c;
        }
    }


    @PostMapping(value = "/save")
    public String addCustomer(@RequestBody Customer customer){
        Customer c= customerRepository.findByNic(customer.getNic());
        if (c==null){
            customer.setStatus(1);
            customerRepository.save(customer);
            return "Customer added Succesfully";
        }else{
            throw new NoSuchElementException("customer found with the id : "+customer.getCustomerid());
        }
    }


    @PostMapping(value = "/update/{nic}")
    public String updateCustomer(@RequestBody Customer customer, @PathVariable String nic){
        Customer c= customerRepository.findByNic(nic);
        if (c==null){
            throw new NoSuchElementException("customer not found with the id : "+customer.getCustomerid());
        }else{
            System.out.println("here");
            c.setName(customer.getName());
            c.setDob(customer.getDob());
            c.setAddress(customer.getAddress());
            c.setOccupation(customer.getOccupation());
            c.setEmail(customer.getEmail());
            c.setMobile(customer.getMobile());
            customerRepository.save(c);
            return "Customer Updated Succesfully";
        }
    }


    @PostMapping(value = "/delete/{nic}")
    public String deleteCustomer(@RequestBody Customer customer, @PathVariable String nic){
        Customer c= customerRepository.findByNic(nic);
        if (c==null){
            throw new NoSuchElementException("customer not found with the id : "+customer.getCustomerid());
        }else{
            c.setStatus(0);
            customerRepository.save(c);
            return "Customer Deleted Succesfully";
        }
    }
/*
    @PostMapping(value = "/deletef/{nic}")
    public String deletefCustomer(@RequestBody Customer customer, @PathVariable String nic){
        Customer c= customerRepository.findByNic(nic);
        if (c==null){
            throw new NoSuchElementException("customer not found with the id : "+customer.getCustomerid());
        }else{
            customerRepository.delete(c);
            return "Customer Deleted Succesfully";
        }
    }
*/
}
