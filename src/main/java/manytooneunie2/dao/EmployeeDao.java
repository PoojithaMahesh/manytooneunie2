package manytooneunie2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunie2.dto.Company;
import manytooneunie2.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveEmployee(Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	
	
	public void saveMultipleEmployee(List<Employee> list) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		for(Employee employee:list) {
			entityManager.persist(employee);
		}
		entityTransaction.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getEmployeeById(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class,id);
		if(dbEmployee!=null) {
			System.out.println(dbEmployee);
		}else {
			System.out.println("id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void deleteEmployeeById(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class,id);
		if(dbEmployee!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	



	public void updateEmployee(int id, Employee employee) {
	EntityManager entityManager=getEntityManager();
	Employee dbEmployee=entityManager.find(Employee.class, id);
	if(dbEmployee!=null) {
//		id is present so u can update your data
		EntityTransaction entityTransaction=entityManager.
				getTransaction();
		entityTransaction.begin();
		employee.setId(id);
//		employee=id name age
		employee.setCompany(dbEmployee.getCompany());
		entityManager.merge(employee);
		entityTransaction.commit();
		
	}else {
		System.out.println("id is not present");
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
