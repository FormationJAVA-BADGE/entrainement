package com.example.SuiviBudget.service;

import com.example.SuiviBudget.model.Categorie;

import java.util.List;

public interface ICategorieService {
    List<Categorie> getAllCategories();

    Categorie createCategorie(Categorie categorie);

}
