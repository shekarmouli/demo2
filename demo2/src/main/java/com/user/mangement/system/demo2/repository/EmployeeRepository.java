package com.user.mangement.system.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.mangement.system.demo2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

