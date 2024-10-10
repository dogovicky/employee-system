package com.capricon.web.controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import com.capricon.web.dao.DataDAO;
import com.capricon.web.model.Department;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String departmentId = (String) session.getAttribute("departmentId");
		Department department = new Department();
		department.setDepartmentId(departmentId);
		
		DataDAO dataDao = new DataDAO();
		int result = dataDao.deleteEmployee(department);
		if(result == 1) {
			RequestDispatcher rd = request.getRequestDispatcher("department.jsp");
			rd.forward(request, response);
			System.out.println("Employee deleted successfully");
		} else {
			System.out.println("Failed to delete employee");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
