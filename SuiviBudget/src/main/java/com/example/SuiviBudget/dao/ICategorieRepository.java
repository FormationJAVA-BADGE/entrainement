package com.example.SuiviBudget.dao;

import com.example.SuiviBudget.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategorieRepository extends JpaRepository<Categorie, Long> { }