package com.example.restapi.controller;

import com.example.restapi.model.entity.Customer;
import com.example.restapi.service.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class CustomerController {
    @Autowired
    private ICustomer customerService;

    @PostMapping("/customer")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/customer")
    public Customer update(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        Customer customerToDelete = customerService.findById(id);
        customerService.delete(customerToDelete);
    }

    @GetMapping("/customer/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer list(@PathVariable Integer id){
        return customerService.findById(id);
    }
}
