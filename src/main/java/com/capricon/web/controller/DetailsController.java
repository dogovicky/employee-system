package com.capricon.web.controller;

import java.io.IOException;
import java.util.List;

import com.capricon.web.dao.DataDAO;
import com.capricon.web.dao.DepartmentDao;
import com.capricon.web.dao.EmployeeDao;
import com.capricon.web.model.Department;
import com.capricon.web.model.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/DetailsServlet")
public class DetailsController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		DataDAO dataDao = new DataDAO();
		
		String departmentId = request.getParameter("departmentId");
		Department department = new Department();
		department.setDepartmentId(departmentId);

		String departmentName = request.getParameter("departmentName");
		request.setAttribute("departmentId", departmentId);
		request.setAttribute("departmentName", departmentName);
		
		//fetch employee details for each department
		List<Employee> employees = dataDao.getEmployees(department);
		for(Employee e : employees) {
			System.out.println(e);
		}
		request.setAttribute("employees", employees);
		session.setAttribute("departmentId", departmentId);
		
		RequestDispatcher rd = request.getRequestDispatcher("department.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
