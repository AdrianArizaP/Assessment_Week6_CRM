package com.example.AssesmentCRM.controllers;

import com.example.AssesmentCRM.models.CustomerEntity;
import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.services.CustomerService;
import com.example.AssesmentCRM.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    /*
    VARIABLES
    */
    @Autowired
    private CustomerService customerService;

    /*
    GET ALL CUSTOMERS METHOD
    */
    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /*
    GET CUSTOMER BY ID METHOD
    */
    @GetMapping("{id_customer}")
    public ResponseEntity<CustomerEntity> getCustomerById(@PathVariable long id_customer) {
        return customerService.getCustomerById(id_customer);
    }
}
