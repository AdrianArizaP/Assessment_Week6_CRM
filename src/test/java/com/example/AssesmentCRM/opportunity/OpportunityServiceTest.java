package com.example.AssesmentCRM.opportunity;

import com.example.AssesmentCRM.models.ContactEntity;
import com.example.AssesmentCRM.models.OpportunityEntity;
import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.services.ContactService;
import com.example.AssesmentCRM.services.OpportunityService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpportunityServiceTest {

    /*
    VARIABLES
    */
    @Autowired
    private OpportunityService opportunityService;


    OpportunityEntity opportunity1;

    /*
    SETTERS OF ENTITY
    */
    @Before
    public void setUp() {
        opportunity1 = new OpportunityEntity();
        opportunity1.setOpportunityName("Adrian");
        opportunity1.setOpportunityPhone("+34 675 786 435");
        opportunity1.setOpportunityEmail("adrian@solera.com");
        opportunity1.setContacts(opportunity1.getContacts());

    }

    /*
    TEST CREATE OPPORTUNITY
    */
    @Test
    public void createOpportunity() {
        Integer numberOpportunity = this.opportunityService.getAllOpportunities().size();
        this.opportunityService.createOpportunity(opportunity1);
        Assert.assertEquals(this.opportunityService.getAllOpportunities().size(), numberOpportunity + 1);
    }

    /*
    TEST UPDATE OPPORTUNITY
    */
    @Test
    public void updateOpportunity() {
        opportunity1.setIdOpportunity(3);
        opportunity1.setOpportunityName("TestOpportunity");
        opportunity1.setOpportunityPhone("+34 678 345 543");
        opportunity1.setOpportunityEmail("opportunity@updateTest.com");


        this.opportunityService.updateOpportunity(opportunity1.getIdOpportunity(), opportunity1);

        ResponseEntity<OpportunityEntity> opportunityResponse = opportunityService.getOpportunityById(opportunity1.getIdOpportunity());

        Assert.assertEquals("TestOpportunity", opportunityResponse.getBody().getOpportunityName());
        Assert.assertEquals("+34 678 345 543", opportunityResponse.getBody().getOpportunityPhone());
        Assert.assertEquals("opportunity@updateTest.com", opportunityResponse.getBody().getOpportunityEmail());
    }

}
