package com.example.AssesmentCRM.contact;

import com.example.AssesmentCRM.models.ContactEntity;
import com.example.AssesmentCRM.models.UserEntity;
import com.example.AssesmentCRM.services.ContactService;
import lombok.extern.log4j.Log4j;
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
public class ContactServiceTest {

    @Autowired
    private ContactService contactService;

    ContactEntity contact1;

    @Before
    public void setUp() {
        contact1 =new ContactEntity();
        contact1.setContactDate(LocalDateTime.of(2022,05,16, 17,30));
        contact1.setContactDescription("Web relacionada en Ecommerce con urgencias.");
        contact1.setOpportunity_entity(contact1.getOpportunity_entity());

    }



    @Test
    public void createContact() {
        Integer numberContact = this.contactService.getAllContacts().size();
        this.contactService.createContact(contact1);
        Assert.assertEquals(this.contactService.getAllContacts().size(), numberContact + 1);
    }
}