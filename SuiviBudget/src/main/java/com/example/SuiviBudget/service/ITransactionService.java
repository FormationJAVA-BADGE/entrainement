package com.example.SuiviBudget.service;

import com.example.SuiviBudget.exception.ResourceNotFoundException;
import com.example.SuiviBudget.model.Transaction;
import com.example.SuiviBudget.model.TypeTransaction;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionService {

    List<Transaction> getAllTransactions();

    Transaction findTransactionById(Long id) throws ResourceNotFoundException;
    Transaction createTransaction(Transaction t);

    List<Transaction> getTransactionsByType(TypeTransaction type);
    List<Transaction> getTransactionsByCategorie(Long categorieId);
    List<Transaction> getTransactionsByDateRange(LocalDate startDate, LocalDate endDate);
}
