package com.example.AssesmentCRM.controllers;


import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.contact.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    GET ALL USERS METHOD
    */
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    /*
      CREATE USER METHOD
    */
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    @GetMapping("{id_user}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable long id_user) {
        return userService.getUserById(id_user);
    }

    @PutMapping("{id_user}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable long id_user, @RequestBody UserEntity userDetails) {
        return userService.updateUser(id_user, userDetails);
    }

    @DeleteMapping("{id_user}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable long id_user) {
        return userService.deleteUser(id_user);
    }


}