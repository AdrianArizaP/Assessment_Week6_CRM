package com.example.AssesmentCRM.opportunity;

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class OpportunityServiceTest {

    @Autowired
    private OpportunityService opportunityService;


    OpportunityEntity opportunity1;


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
