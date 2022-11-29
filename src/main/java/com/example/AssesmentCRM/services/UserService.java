package com.example.AssesmentCRM.services;

import com.example.AssesmentCRM.entities.UserEntity;
import com.example.AssesmentCRM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired

    public UserRepository userRepository;

    /*
      GET ALL USERS METHOD
      */
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }



}
