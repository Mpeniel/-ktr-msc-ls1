package com.example.epictechproject.entities;

import javax.persistence.*;

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserProfile;

    private String nomUserProfile;

    private String company;

    private String email;

    private String telephone;

    @ManyToOne
    @JoinColumn
    private User user;

    public UserProfile() {
    }

    public UserProfile(Long idUserProfile, String nomUserProfile, String company, String email, String telephone, User user) {
        this.idUserProfile = idUserProfile;
        this.nomUserProfile = nomUserProfile;
        this.company = company;
        this.email = email;
        this.telephone = telephone;
        this.user = user;
    }

    public Long getIdUserProfile() {
        return idUserProfile;
    }

    public void setIdUserProfile(Long idUserProfile) {
        this.idUserProfile = idUserProfile;
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

    public String getNomUserProfile() {
        return nomUserProfile;
    }

    public void setNomUserProfile(String nomUserProfile) {
        this.nomUserProfile = nomUserProfile;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
