package com.example.AssesmentCRM.customer;

import com.example.AssesmentCRM.services.ContactService;
import com.example.AssesmentCRM.services.CustomerService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
}
