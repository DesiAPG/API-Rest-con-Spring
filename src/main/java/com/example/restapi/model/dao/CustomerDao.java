package com.example.restapi.model.dao;

import com.example.restapi.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerDao extends CrudRepository<Customer,Integer> {

}
