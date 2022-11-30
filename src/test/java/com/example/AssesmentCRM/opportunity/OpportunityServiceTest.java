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
        opportunity1 =new OpportunityEntity();
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



}
