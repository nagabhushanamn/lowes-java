package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@PersistenceContext
	private EntityManager em;

	public void save(Employee employee) {
		em.persist(employee);
	}

	public Employee findOne(int i) {
		return em.find(Employee.class, i);
	}

}
