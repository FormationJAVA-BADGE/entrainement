package com.example.SuiviBudget.service;

import com.example.SuiviBudget.dao.ITransactionRepository;
import com.example.SuiviBudget.exception.ResourceNotFoundException;
import com.example.SuiviBudget.model.Transaction;
import com.example.SuiviBudget.model.TypeTransaction;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TransactionServiceImpl implements ITransactionService {

    private ITransactionRepository transactionRepository;
    public TransactionServiceImpl(ITransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findTransactionById(Long id) throws ResourceNotFoundException {
        return transactionRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Transaction not found with id: " + id));
    }

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactionsByType(TypeTransaction type) {
        return transactionRepository.findByType(type);
    }

    public List<Transaction> getTransactionsByCategorie(Long categorieId) {
        return transactionRepository.findByCategorieId(categorieId);
    }



    public List<Transaction> getTransactionsByDateRange(LocalDate startDate, LocalDate endDate) {
        return transactionRepository.findByDateRange(startDate, endDate);
    }
}
