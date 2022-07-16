package com.NgSpringExample1.NgSpringExample1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NgSpringExample1.NgSpringExample1.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
