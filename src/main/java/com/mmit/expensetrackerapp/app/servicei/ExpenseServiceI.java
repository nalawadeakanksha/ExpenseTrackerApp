package com.mmit.expensetrackerapp.app.servicei;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmit.expensetrackerapp.app.model.Expense;
import com.mmit.expensetrackerapp.app.model.User;


public interface ExpenseServiceI {

    //public Expense addExpense(Expense expense) ;
    

   

    public Expense getExpenseById(Long id);
  
    public User updateExpense(Long id, Expense expenseDetails,String username);

    public void deleteExpense(int id) ;


	public User loginUser(String username, String password);


	public void addUser(User u);


	public User addExpense(Expense expense, String username);
       
}
