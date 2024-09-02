package com.mmit.expensetrackerapp.app.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.mmit.expensetrackerapp.app.model.Expense;
import com.mmit.expensetrackerapp.app.model.User;
import com.mmit.expensetrackerapp.app.repositary.ExpenseRepository;
import com.mmit.expensetrackerapp.app.repositary.UserRepositary;
import com.mmit.expensetrackerapp.app.servicei.ExpenseServiceI;

import jakarta.transaction.Transactional;

@Service
public class ExpenseServiceImpl  implements ExpenseServiceI
{

    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private UserRepositary ur;

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).get();
    }

    public User updateExpense(Long id, Expense expenseDetails,String username) {
        Expense expense = expenseRepository.findById(id).get();
              
        
        expense.setCategory(expenseDetails.getCategory());
        expense.setAmount(expenseDetails.getAmount());
        expense.setComments(expenseDetails.getComments());
         expenseRepository.save(expense);
         
         return ur.findAllByUsername(username);
    }

    @Transactional
    @Modifying
    public void deleteExpense(int id) {
//      Optional<Expense> targetRefrance = expenseRepository.findById(id);
//       
//       List<User> targetusers = ur.findAll().stream().filter(u->u.getExpense()!=null && u.getExpense().getId()==id).collect(Collectors.toList());
//       
//       User targetuser=targetusers.get(0);
//              targetuser.setExpense(null);
//           ur.save(targetuser);  
    	Optional<User> optionalUser = ur.findById(id);
    	Long expenceId=0l;
    	if(optionalUser.isPresent()) {
    		User targetUser=optionalUser.get();
    		expenceId=targetUser.getExpense().getId();
    		targetUser.setExpense(null);
    		ur.save(targetUser);
    	}
       expenseRepository.deleteById(expenceId);
     
    }

	@Override
	public User loginUser(String username, String password) {
		  
		
		return ur.findByUsernameAndPassword(username, password);
	}

	@Override
	public void addUser(User u) {
    ur.save(u);		
	}

	@Override
	public User addExpense(Expense expense, String username) {
		   User u         =  ur.findByUsername(username);
		   u.setExpense(expense);
		   
		  
		   return ur.save(u);
	}
}
