package com.example.AssesmentCRM.services;

import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.exception.ResourceNotFoundException;
import com.example.AssesmentCRM.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    /*
    VARIABLES
    */
    @Autowired
    public UserRepository userRepository;

    /*
    GET ALL USERS METHOD
    */
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    /*
    CREATE USER METHOD
    */
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    /*
    GET USER BY ID METHOD
    */
    public ResponseEntity<UserEntity> getUserById(long id_user) {
        UserEntity userEntity = userRepository.findById(id_user).orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));
        return ResponseEntity.ok(userEntity);
    }

    /*
    UPDATE USER BY ID METHOD
    */
    public ResponseEntity<UserEntity> updateUser(long id_user, UserEntity userDetails) {
        UserEntity updateUser = userRepository.findById(id_user).orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));

        updateUser.setUsername(userDetails.getUsername());
        updateUser.setPassword(userDetails.getPassword());
        updateUser.setEmail(userDetails.getEmail());

        userRepository.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }

    /*
    DELETE USER BY ID METHOD
    */
    public ResponseEntity<UserEntity> deleteUser(long id_user) {
        UserEntity deleteUser = userRepository.findById(id_user).orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_user));

        userRepository.delete(deleteUser);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    // public List<UserEntity> findName(String name){
    //  return userRepository.findByName();
    //}

    //  public Boolean existByName(Long id_user){
    //    return userRepository.existsById(id_user);
    // }


}
