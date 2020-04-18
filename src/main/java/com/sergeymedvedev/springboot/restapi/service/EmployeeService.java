package com.sergeymedvedev.springboot.restapi.service;

import com.sergeymedvedev.springboot.restapi.dao.EmployeeDAO;
import com.sergeymedvedev.springboot.restapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Transactional
	public Employee get(int id) {
		return employeeDAO.get(id);
	}

	@Transactional
	public void save(Employee employee) {
		employeeDAO.save(employee);
	}

	@Transactional
	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	@Transactional
	public void delete(int id) {
		employeeDAO.delete(id);
	}

}
