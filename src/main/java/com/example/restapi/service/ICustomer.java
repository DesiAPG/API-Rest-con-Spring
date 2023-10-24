package com.example.restapi.service;

import com.example.restapi.model.entity.Customer;

public interface ICustomer {
    Customer save(Customer customer);
    Customer findById(Integer id);
    void delete(Customer customer);
}
