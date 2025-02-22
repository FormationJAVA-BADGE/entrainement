package com.example.SuiviBudget.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    private double montant;

    private LocalDate date;

    private String description;

    @ManyToOne
    private Categorie categorie;

    @Enumerated(EnumType.STRING)
    private TypeTransaction type;

    public Long getId() { return id;}

    public void setId(Long id) {this.id = id;}

    public double getMontant() {return montant;}

    public void setMontant(double montant) {this.montant = montant;}

    public LocalDate getDate() {return date;}

    public void setDate(LocalDate date) {this.date = date;}

    public String getDescription() {return description;}

    public void setDescription(String description) { this.description = description;}

    public Categorie getCategorie() {return categorie;}

    public void setCategorie(Categorie categorie) {this.categorie = categorie;}

    public TypeTransaction getType() {return type;}

    public void setType(TypeTransaction type) {this.type = type; }
}
