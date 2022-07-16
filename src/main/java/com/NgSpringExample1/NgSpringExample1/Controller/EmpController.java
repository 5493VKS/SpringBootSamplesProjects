package com.NgSpringExample1.NgSpringExample1.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NgSpringExample1.NgSpringExample1.Model.Employee;
import com.NgSpringExample1.NgSpringExample1.Repo.EmployeeRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class EmpController {

	@Autowired
	EmployeeRepository emprepo;
	
	@PostMapping("/employees")
	public Employee createEmployee(@Valid @RequestBody Employee emp) {
		
		System.out.println("Employee createEmployee");
		return emprepo.save(emp);
		
	}
	@GetMapping("/employees")
    public List<Employee> getAllEmployees() {
		System.out.println("Employee getAllEmployees");
        return emprepo.findAll();
    }
    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
    {
        Employee employee = emprepo.findById(employeeId).orElseThrow(null);

        emprepo.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
      {
        Employee employee = emprepo.findById(employeeId).orElseThrow(null);
        return ResponseEntity.ok().body(employee);
    }

}
