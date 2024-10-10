package com.capricon.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.capricon.web.model.Department;
import com.capricon.web.model.Employee;

public class DepartmentDao {

	//@SuppressWarnings("deprecation")
	/*public static List<Department> getDepartment() {
		Configuration con = new Configuration().configure().addAnnotatedClass(Department.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query fetchDepartments = session.createQuery("from Department");
		
		@SuppressWarnings("unchecked")
		List<Department> departments = fetchDepartments.list();
		for(Department d : departments) {
			System.out.println(d);
		}
		
		tx.commit();
		
		return departments;
	}
	
	//fetch employees based on their departments
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public static List<Employee> getEmployees(String departmentId) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Query fetchEmployees = session.createQuery("from Employee e where e.departmentId = :departmentId");
		fetchEmployees.setParameter("departmentId", departmentId);
		
		List<Employee> employees = fetchEmployees.list();
		
		tx.commit();
		return employees;
	}*/
	
	
}
