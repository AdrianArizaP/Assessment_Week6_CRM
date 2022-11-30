package com.example.AssesmentCRM.controllers;

import com.example.AssesmentCRM.models.CustomerEntity;
import com.example.AssesmentCRM.models.OpportunityEntity;
import com.example.AssesmentCRM.services.ContactService;
import com.example.AssesmentCRM.services.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/opportunity")
public class OpportunityController {

    /*
    VARIABLES
    */
    @Autowired
    private OpportunityService opportunityService;

    /*
    GET ALL OPPORTUNITIES METHOD
    */
    @GetMapping
    public List<OpportunityEntity> getAllOpportunities() {
        return opportunityService.getAllOpportunities();
    }

    /*
    GET OPPORTUNITY BY ID METHOD
    */
    @GetMapping("{id_opportunity}")
    public ResponseEntity<OpportunityEntity> getOpportunityById(@PathVariable long id_opportunity) {
        return opportunityService.getOpportunityById(id_opportunity);
    }

}
