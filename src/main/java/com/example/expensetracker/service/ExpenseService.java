package com.example.expensetracker.service;

import com.example.expensetracker.repository.ExpenseRepository;
import com.example.expensetracker.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    //queries, equivalent to methods

    //SELECT * FROM expense;
    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    //INSERT INTO expense(description, amount) VALUES ('description_value', amount_value);
    public void saveExpense(Expense expense){
        expenseRepository.save(expense);
    }
    //SELECT * FROM expense;
    public Expense getExpenseById(Long id){
        return expenseRepository.findById(id).orElse(null);
    }
    //SELECT * FROM expense;
    public void deleteExpenseById(Long id){
        expenseRepository.deleteById(id);
    }
}
