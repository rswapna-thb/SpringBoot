package com.thb.repository;
import com.thb.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

	
	
}
