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

public class EmployeeDao {
	
	//fetch employees related to a certain department
	@SuppressWarnings("deprecation")
	public static List<Employee> getEmployees(String id) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Employee where departmentId = :id");
		query.setParameter("id", id);
		
		List<Employee> employees = query.list();
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		
		tx.commit();
		return employees;
	}
	
	
	//save employees
	public void saveEmployee(Employee employee) {
		
	}

}
