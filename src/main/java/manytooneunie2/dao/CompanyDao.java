package manytooneunie2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunie2.dto.Company;
import manytooneunie2.dto.Employee;

public class CompanyDao {

	public EntityManager getEntityManager() {
		return Persistence.
				createEntityManagerFactory("vinod").
				createEntityManager();
	}
	
	public void saveCompany(Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
	public void getCompanyById(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,id);
		if(dbCompany!=null) {
			System.out.println(dbCompany);
		}else {
			System.out.println("id is not present");
		}
	}
	
	
	public void deleteCompanyById(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class,id);
		if(dbCompany!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbCompany);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void updateCompany(int id,Company company) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			id is present
			entityTransaction.begin();
			company.setId(id);
			entityManager.merge(company);
			entityTransaction.commit();
		}else {
//			id is npt present
			System.out.println("sorry id is not present");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
}
