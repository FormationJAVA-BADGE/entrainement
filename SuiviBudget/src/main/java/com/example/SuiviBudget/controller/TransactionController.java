package com.example.SuiviBudget.controller;

import com.example.SuiviBudget.model.Transaction;
import com.example.SuiviBudget.model.TypeTransaction;
import com.example.SuiviBudget.service.ITransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    private final ITransactionService transactionService;

    public TransactionController(ITransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        return new ResponseEntity<>( transactionService.getAllTransactions(), HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<Transaction>> getTransactionsByType(TypeTransaction type) {
        return new ResponseEntity<>(transactionService.getTransactionsByType(type), HttpStatus.OK);
    }

    @GetMapping("/categorie/{id}")
    public ResponseEntity<List<Transaction>>  getTransactionsByCategorie(@PathVariable("id") Long categorieId) {
        return new ResponseEntity<>(transactionService.getTransactionsByCategorie(categorieId), HttpStatus.OK);
    }

    @GetMapping("/date-range/{startDate}/{endDate}")
    public ResponseEntity<List<Transaction>> getTransactionsByDateRange(@PathVariable("startDate") LocalDate startDate,
                                                        @PathVariable("endDate")LocalDate endDate) {
        return new ResponseEntity<>(transactionService.getTransactionsByDateRange(startDate, endDate), HttpStatus.OK);
    }
}
