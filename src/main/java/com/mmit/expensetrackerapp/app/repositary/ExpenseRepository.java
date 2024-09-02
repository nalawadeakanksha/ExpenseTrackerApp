package com.mmit.expensetrackerapp.app.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mmit.expensetrackerapp.app.model.Expense;

import jakarta.transaction.Transactional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
   
	@Query(value = "delete from expense where id=?1;" ,nativeQuery = true)
	public int deletedata(long id);
	}
