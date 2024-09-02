package com.mmit.expensetrackerapp.app.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mmit.expensetrackerapp.app.model.Expense;
import com.mmit.expensetrackerapp.app.model.User;

@Repository
public interface UserRepositary extends JpaRepository<User,Integer>
{
public User  findByUsername(String username);
	public User findAllByUsername(String username);
	public User findByUsernameAndPassword(String username, String password);
//	@Query(value = "delete from user where expense.id=?1")
//	public void Deletedata(long id);
}
