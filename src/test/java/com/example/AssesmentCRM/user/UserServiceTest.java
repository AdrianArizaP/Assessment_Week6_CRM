package com.example.AssesmentCRM.user;

import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.services.UserService;
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

    /*
    VARIABLES
    */
    @Autowired
    private UserService userService;

    UserEntity user1;

    /*
    SETTERS OF ENTITY
    */
    @Before
    public void setUp() {
        user1=new UserEntity();
        user1.setUsername("Prueba");
        user1.setPassword("PruebaPass123!");
        user1.setEmail("prueba@solera.com");
    }



    /*
    TEST CREATE USER
    */
    @Test
    public void createUser() {
        Integer numberUser = this.userService.getAllUsers().size();
        this.userService.createUser(user1);
        Assert.assertEquals(this.userService.getAllUsers().size(), numberUser + 1);
    }

}
