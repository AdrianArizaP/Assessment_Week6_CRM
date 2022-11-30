package com.example.AssesmentCRM.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "contact")
public class ContactEntity {

    // VARIABLES
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_contact")
    private long idContact;
    @Column(name="contact_date", nullable = false)
    private Date contactDate;
    @Column(name="contact_description", nullable = false, length = 200)
    private String contactDescription;

    @ManyToOne
    @JoinColumn(name = "contact_id_opportunity")
    private OpportunityEntity opportunity_entity;



    // CONSTRUCTORS
        // EMPTY
        public ContactEntity() {
        }

        // FULL
        public ContactEntity(long idContact, Date contactDate, String contactDescription, OpportunityEntity opportunity_entity) {
            this.idContact = idContact;
            this.contactDate = contactDate;
            this.contactDescription = contactDescription;
            this.opportunity_entity = opportunity_entity;
        }

    //GETTERS AND SETTERS
    public long getIdContact() {
        return idContact;
    }

    public void setIdContact(long idContact) {
        this.idContact = idContact;
    }

    public Date getContactDate() {
        return contactDate;
    }

    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactDescription() {
        return contactDescription;
    }

    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public OpportunityEntity getOpportunity_entity() {
        return opportunity_entity;
    }

    public void setOpportunity_entity(OpportunityEntity opportunity_entity) {
        this.opportunity_entity = opportunity_entity;
    }

    //TO STRING
    @Override
    public String toString() {
        return "ContactEntity{" +
                "idContact=" + idContact +
                ", contactDate=" + contactDate +
                ", contactDescription='" + contactDescription + '\'' +
                ", opportunity_entity=" + opportunity_entity +
                '}';
    }
}
