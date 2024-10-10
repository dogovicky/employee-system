package com.capricon.web.controller;

import java.io.IOException;

import com.capricon.web.dao.DataDAO;
import com.capricon.web.model.Department;
import com.capricon.web.model.Employee;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AddServlet")
public class AddEmployeeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataDAO dataDao = new DataDAO();
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String gender = request.getParameter("gender");
		String departmentId = request.getParameter("department");
		Department department = new Department();
		department.setDepartmentId(departmentId);
		
		String employeeId = request.getParameter("employeeId");
		String worktime = request.getParameter("worktime");
		String workplace = request.getParameter("workplace");
		
		Employee employee = new Employee();
		employee.setDepartment(department);
		employee.setEmployeeId(email);
		employee.setFirstName(firstname);
		employee.setLastName(lastname);
		employee.setPhone(phone);
		employee.setWorkingSite(workplace);
		employee.setWorkingTime(worktime);
		employee.setGender(gender);
		employee.setEmployeeId(employeeId);
		
		
		dataDao.saveEmployee(employee);
		
	}

}



















