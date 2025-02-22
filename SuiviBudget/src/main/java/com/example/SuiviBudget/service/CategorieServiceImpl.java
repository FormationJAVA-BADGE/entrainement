package com.example.SuiviBudget.service;

import com.example.SuiviBudget.dao.ICategorieRepository;
import com.example.SuiviBudget.model.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements ICategorieService{
    private  ICategorieRepository categorieRepository;

    public CategorieServiceImpl(ICategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    public Categorie createCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }
}
