package com.example.restapi.service.impl;

import com.example.restapi.model.dao.CustomerDao;
import com.example.restapi.model.entity.Customer;
import com.example.restapi.service.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerImpl implements ICustomer {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer save(Customer customer) {
        return customerDao.save(customer);
    }

    @Transactional(readOnly = true)
    @Override
    public Customer findById(Integer id) {
        return customerDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }
}
