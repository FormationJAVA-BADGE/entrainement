package com.example.SuiviBudget.dao;

import com.example.SuiviBudget.model.Transaction;
import com.example.SuiviBudget.model.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByType(TypeTransaction type);
    List<Transaction> findByCategorieId(Long categorieId);

    @Query("SELECT t FROM Transaction t WHERE t.date BETWEEN :startDate AND :endDate")
    List<Transaction> findByDateRange(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
