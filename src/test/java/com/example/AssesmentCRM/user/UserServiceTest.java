package com.example.AssesmentCRM.user;

import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.contact.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {


    @Autowired
    private UserService userService;

    UserEntity us1;

    @Before
    public void setUp() {
        us1=new UserEntity();
        us1.setUsername("Prueba");
        us1.setPassword("PruebaPass123!");
        us1.setEmail("prueba@solera.com");
    }




    @Test
    public void createUser() {
        Integer nUser = this.userService.getAllUsers().size();
        this.userService.createUser(us1);
        Assert.assertEquals(this.userService.getAllUsers().size(), nUser + 1);
    }

}
