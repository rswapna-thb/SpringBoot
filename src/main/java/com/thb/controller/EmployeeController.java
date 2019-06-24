package com.thb.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thb.*;
import com.thb.dao.EmployeeDAO;
import com.thb.model.Employee;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
EmployeeDAO dao;
	
	@PostMapping(path="/add")
	
	public @ResponseBody Employee addUser(@RequestBody Employee emp)
	{
		return dao.save(emp);
	}
	
	
	@GetMapping("/list")
	
	public List<Employee> getUser(Employee emp)
	{
		return dao.findall();
	}
	
	
	
	
	
	
	
}
