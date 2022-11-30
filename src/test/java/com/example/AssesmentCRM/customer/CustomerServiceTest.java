package com.example.AssesmentCRM.customer;

import com.example.AssesmentCRM.models.CustomerEntity;
import com.example.AssesmentCRM.models.OpportunityEntity;
import com.example.AssesmentCRM.services.ContactService;
import com.example.AssesmentCRM.services.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;


    CustomerEntity customer1;


    /*
    TEST CREATE CUSTOMER
    */
    @Test
    public void createCustomer() {
        Integer numberCustomer = this.customerService.getAllCustomers().size();
        this.customerService.createCustomer(customer1);
        Assert.assertEquals(this.customerService.getAllCustomers().size(), numberCustomer + 1);
    }


}
