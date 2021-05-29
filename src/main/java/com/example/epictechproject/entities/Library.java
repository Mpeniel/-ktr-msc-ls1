package com.example.epictechproject.entities;

import javax.persistence.*;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibrary;

    private String name;

    private String company;

    private String email;

    private String telephone;

    @ManyToOne
    @JoinColumn
    private User user;

    public Library() {
    }

    public Library(String name, String company, String email, String telephone, User user) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.telephone = telephone;
        this.user = user;
    }

    public Long getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Long idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
