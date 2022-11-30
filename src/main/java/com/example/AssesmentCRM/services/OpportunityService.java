package com.example.AssesmentCRM.services;

import com.example.AssesmentCRM.exception.ResourceNotFoundException;
import com.example.AssesmentCRM.models.CustomerEntity;
import com.example.AssesmentCRM.models.OpportunityEntity;
import com.example.AssesmentCRM.repositories.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpportunityService {

    /*
    VARIABLES
    */
    @Autowired
    public OpportunityRepository opportunityRepository;

    /*
    GET ALL OPPORTUNITIES METHOD
    */
    public List<OpportunityEntity> getAllOpportunities() {
        return opportunityRepository.findAll();
    }

    /*
    GET OPPORTUNITY BY ID METHOD
    */
    public ResponseEntity<OpportunityEntity> getOpportunityById(long id_opportunity) {
        OpportunityEntity opportunityEntity = opportunityRepository.findById(id_opportunity)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id: " + id_opportunity));
        return ResponseEntity.ok(opportunityEntity);
    }






}
