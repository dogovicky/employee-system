package com.capricon.web.dao;

import java.util.ArrayList;
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

//this class is responsible for all interactions with the database
public class DataDAO {
	
	public Session session() {

		Configuration con = new Configuration().configure().addAnnotatedClass(Department.class).addAnnotatedClass(Employee.class);
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		return session;
	}
	
	//fetch departments from the database
	@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
	public List<Department> getDepartments() {
		
		Transaction tx = session().beginTransaction();
		
		Query depQuery = session().createQuery("from Department");
		List<Department> departments = depQuery.list();
		
		tx.commit();
		
		return departments;
	}
	
	//fetch employees for a specific department
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public List<Employee> getEmployees(Department department) {
		
		Transaction tx = session().getTransaction();
		tx.begin();
		Query empQuery = session().createQuery("from Employee e where e.department = :id");
		empQuery.setParameter("id", department);
		
		List<Employee> employees = empQuery.list();
		tx.commit();
		return employees;
		
	}
	
	//save new employees in the database
	@SuppressWarnings("deprecation")
	public void saveEmployee(Employee employee) {
		
		Transaction tx = null;
		
		try {
			
			tx = session().getTransaction();
			tx.begin();
			session().save(employee);
			session().flush();
			tx.commit();
			
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session().close();
		}
		
	}
	
	//delete employee from a department
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public int deleteEmployee(Department department) {
		int result = 0;
		Transaction tx = session().getTransaction();
		tx.begin();
		
		Query delQuery = session().createQuery("delete from Employee e where e.department = :id");
		delQuery.setParameter("id", department);
		
		result = delQuery.executeUpdate();
		
		tx.commit();
		return result;
	}

}
















