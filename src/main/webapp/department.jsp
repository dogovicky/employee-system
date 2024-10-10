<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department</title>
</head>
<body>
	
	<div class="container">
		<h4>Department ${departmentId}</h4>
		<c:if test="${employees} == null">
			<h4>This department does not have any employees for now, click on Add Employees to add new employees.</h4>
		</c:if>
		<div class="employee-details">
			<ul>
				<c:forEach var="employee" items="${employees}">
					<li>
						<h4>${employee.employeeId} <span><button><a href="DeleteEmployee?department=${employee.department}">Delete Employee</a></button></span></h4> 
					</li>
					
				</c:forEach>
			</ul>
			
			<div>
				<button><a href="addemployee.jsp">Add Employee</a></button>
			</div>
		</div>
	</div>
	
</body>
</html>