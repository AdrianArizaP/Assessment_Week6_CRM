package com.example.AssesmentCRM.entities;



import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class UserEntity {

    // VARIABLES
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_user", length = 20)
    private long idUser;
    @Column(name = "username",  length = 20)
    private String username;
    @Column(name = "password", length = 45)
    private String password;

    @Column(name = "email",  length = 60)
    private String email;

    //CONSTRUCTORS
        //EMPTY
        public UserEntity() {

        }

        // FULL
        public UserEntity(long idUser, String username, String password, String email) {
            this.idUser = idUser;
            this.username = username;
            this.password = password;
            this.email = email;
        }

    public UserEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    //GETTERS AND SETTERS
    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //TO STRING
    @Override
    public String toString() {
        return "UserEntity{" +
                "idUser=" + idUser +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}