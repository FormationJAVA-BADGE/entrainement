package com.example.SuiviBudget.controller;


import com.example.SuiviBudget.model.Categorie;
import com.example.SuiviBudget.service.ICategorieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    private final ICategorieService categorieService;

    public CategorieController(ICategorieService categorieRepository) {
        this.categorieService = categorieRepository;
    }

    @GetMapping
    public ResponseEntity<List<Categorie>> getAllCategories() {
        return new ResponseEntity<>(categorieService.getAllCategories(), HttpStatus.OK);
    }

    @PostMapping
    public Categorie createCategorie(@RequestBody Categorie categorie) {
        return categorieService.createCategorie(categorie);
    }
}
