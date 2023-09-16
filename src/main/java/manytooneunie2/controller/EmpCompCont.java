package manytooneunie2.controller;

import java.util.ArrayList;
import java.util.List;

import manytooneunie2.dao.CompanyDao;
import manytooneunie2.dao.EmployeeDao;
import manytooneunie2.dto.Company;
import manytooneunie2.dto.Employee;

public class EmpCompCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setId(2);
	company.setName("zoho");
	company.setAddress("bangalore");
	
	Employee employee1=new Employee();
	employee1.setId(4);
	employee1.setName("adesh");
	employee1.setAge(21);
	employee1.setCompany(company);
	
	
	Employee employee2=new Employee();
	employee2.setId(5);
	employee2.setName("gayatri");
	employee2.setAge(35);
	employee2.setCompany(company);
	
	
	Employee employee3=new Employee();
	employee3.setId(6);
	employee3.setName("hatim");
	employee3.setAge(18);
    employee3.setCompany(company);	
    
    CompanyDao companyDao=new CompanyDao();
//    companyDao.saveCompany(company);
    EmployeeDao employeeDao=new EmployeeDao();
//    employeeDao.saveEmployee(employee1);
//    employeeDao.saveEmployee(employee2);
//    employeeDao.saveEmployee(employee3);
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
////    List<Employee> employees=new ArrayList<Employee>();
////    employees.add(employee1);
////    employees.add(employee2);
////    employees.add(employee3);
//    
    
//	persist a non owning side 
   
//	employeeDao.saveMultipleEmployee(employees);
	
// companyDao.deleteCompanyById(1);
//	employeeDao.deleteEmployeeById(1);
//	Company company2=new Company();
//	company2.setName("hp");
//	company2.setAddress("mysore");
//	companyDao.updateCompany(1, company2);
    
    
    Employee employee=new Employee();
    employee.setName("pandajag");
    employee.setAge(30);
   
    
    employeeDao.updateEmployee(3,employee);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
