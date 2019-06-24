package com.thb.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.thb.model.Employee;
import com.thb.repository.EmployeeRepository;
import java.util.*;
@Service

public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
	public Employee save(Employee emp)
	{
		
		return  employeeRepository.save(emp);
	}
	
	public List<Employee> findall()
	{
		return employeeRepository.findAll();
	}
	
	public Employee findone(Long empid)
	{
		return employeeRepository.getOne(empid);
	}
	
	public String deleteone(Long id)
	{   
		 employeeRepository.deleteAll();
	      return "deleted";
	}
	
}
