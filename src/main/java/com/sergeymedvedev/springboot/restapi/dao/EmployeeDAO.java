package com.sergeymedvedev.springboot.restapi.dao;

import com.sergeymedvedev.springboot.restapi.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAO {

	@Autowired
	private EntityManager entityManager;

	public List<Employee> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	public Employee get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		return employee;
	}

	public void save(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(employee);
	}

	public void update(Employee employee) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(employee);
}

//	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		currentSession.delete(employee);
	}

}
