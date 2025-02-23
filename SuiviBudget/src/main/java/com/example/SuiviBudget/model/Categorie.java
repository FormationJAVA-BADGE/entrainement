package com.example.SuiviBudget.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Categorie {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String description;

    public Categorie() { }

    public Long getId() { return id;}

    public void setId(Long id) {this.id = id;}

    public String getNom() { return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public String getDescription() { return description;}

    public void setDescription(String description) {this.description = description;}
}
