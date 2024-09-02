package com.mmit.expensetrackerapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mmit.expensetrackerapp.app.model.Expense;
import com.mmit.expensetrackerapp.app.model.User;
import com.mmit.expensetrackerapp.app.servicei.ExpenseServiceI;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ExpenseController {

    @Autowired
    private ExpenseServiceI expenseService;

    @RequestMapping("/opensignup")
    public String OpenSignUpForm() {
        return "SignUp";
    }
    @RequestMapping("/login")
    public String OpenSignInForm() {
        return "login";
    }
    
    @RequestMapping(value="/addUser")
    public String addUser(@ModelAttribute User u) {
        expenseService.addUser(u);
        return "login";
    }
    @RequestMapping("/openaddExpenses")
    public String openaddExpenses() {
        return "addExpense";
    }
    
    @RequestMapping("/addExpense")
    public String createExpense(@ModelAttribute Expense expense,Model m,HttpSession session) {
      Object o= session.getAttribute("username");
      String username=(String)o;
      User u=	expenseService.addExpense(expense,username);
        m.addAttribute("u",u);
         return "viewExpenses";
    }

    @RequestMapping("/loginCheck")
    public String getAllExpenses(@RequestParam("username")String username,@RequestParam("password")String password,Model m,HttpSession session) {
      	
    	User u     =expenseService.loginUser(username,password);
if(u!=null) {
	session.setAttribute("username",username);
    return "viewExpenses";	
      	}
else {
	return "login";

    }
    }
    @RequestMapping("/editExpenses")
    public String getExpenseById(@RequestParam("id") Long id,Model m) {
        Expense expense = expenseService.getExpenseById(id);
        m.addAttribute("e", expense);
        return "editExpenses";
    }

    @RequestMapping("/updateExpenses")
    public String updateExpense(@RequestParam("id") Long id, @ModelAttribute Expense expenseDetails,Model m,HttpSession session) {
        Object o= session.getAttribute("username");
        String username=(String)o;
      User u  = expenseService.updateExpense(id, expenseDetails,username);
       m.addAttribute("u",u);
        return "viewExpenses";
    }

    @RequestMapping("/deleteExpenses")
    public String deleteExpense(@RequestParam("id") int id,Model m) {
        expenseService.deleteExpense(id);
      
        return "login";
    }
}
