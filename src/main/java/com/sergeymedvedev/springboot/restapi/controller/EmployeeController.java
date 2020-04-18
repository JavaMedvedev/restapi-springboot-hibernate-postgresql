package com.sergeymedvedev.springboot.restapi.controller;

import com.sergeymedvedev.springboot.restapi.model.Employee;
import com.sergeymedvedev.springboot.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id) {
		Employee employee = employeeService.get(id);
		if(employee == null) {
			throw new RuntimeException("Employee not found for the Id:" + id);
		}
		return employee;
	}

	@PostMapping("/employee")
	public Employee save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
	}

	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employee) {
		employeeService.update(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable int id) {
		employeeService.delete(id);
		return "Employee has been deleted with Id: " + id;
	}
}
