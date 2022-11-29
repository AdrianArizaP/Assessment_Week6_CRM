package com.example.AssesmentCRM.controllers;


import com.example.AssesmentCRM.entities.UserEntity;
import com.example.AssesmentCRM.exception.ResourceNotFoundException;
import com.example.AssesmentCRM.repositories.UserRepository;
import com.example.AssesmentCRM.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    /*
      CREATE USER METHOD
    */
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @GetMapping("{id_user}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable long id_user){
        UserEntity userEntity = userRepository.findById(id_user)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));
                return ResponseEntity.ok(userEntity);
    }

    @PutMapping("{id_user}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable long id_user,@RequestBody UserEntity userDetails){
        UserEntity updateUser = userRepository.findById(id_user)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));

        updateUser.setUsername(userDetails.getUsername());
        updateUser.setPassword(userDetails.getPassword());
        updateUser.setEmail(userDetails.getEmail());

        userRepository.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("{id_user}")
    public ResponseEntity<UserEntity> deleteUser(@PathVariable long id_user){
        UserEntity deleteUser = userRepository.findById(id_user)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));

        userRepository.delete(deleteUser);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}