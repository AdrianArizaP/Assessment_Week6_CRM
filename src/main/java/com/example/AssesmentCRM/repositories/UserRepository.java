package com.example.AssesmentCRM.repositories;

import com.example.AssesmentCRM.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;




// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //all crud databse methods




}
