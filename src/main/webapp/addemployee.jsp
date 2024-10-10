<%@page import="jakarta.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	
	HttpSession sess = request.getSession();
	String departmentId = (String) sess.getAttribute("departmentId");
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<body>

	<div class="container">
		<h4>Add a new employee</h4>
		
		<div class="form-container">
			<form action="AddServlet" method="post">
				<div class="employee-details">
					<div class="input-box">
						<input type="text" name="firstname" placeholder="First Name.." />
					</div>
					<div class="input-box">
						<input type="text" name="lastname" placeholder="Last Name.." />
					</div>
					<div class="input-box">
						<input type="email" name="email" placeholder="Email.." />
					</div>
					<div class="input-box">
						<input type="tel" name="phone" placeholder="Phone Number..." />
					</div>
					<div class="input-box">
						<input type="radio" name="gender" value="Male" checked /> Male <br/>
						<input type="radio" name="gender" value="Female" /> Female <br />
					</div> 
					
				</div>
				<div class="department-details">
					<div class="input-box">
						<input type="text" name="department" value="${departmentId}" />
					</div>
					<div class="input-box">
						<input type="text" name="employeeId" placeholder="Employee ID" />
					</div>
					<div class="input-box">
						<input type="radio" name="worktime" value="Full Time" checked /> Full Time <br />
						<input type="radio" name="worktime" value="Part Time" /> Part Time <br />
					</div>
					<div class="input-box">
						<input type="radio" name="workplace" value="On Site" checked /> On Site <br />
						<input type="radio" name="workplace" value="Remote" /> Remote <br />
					</div>
				</div>
				
				<button type="submit">Add Employee</button>
			</form>
		</div>
		
	</div>

</body>
</html>