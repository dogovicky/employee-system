<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department Section</title>
</head>
<body>
	<div class="container">
		<div id="head">
			<h4>Departments</h4>
			<p>You can view and edit department employees by clicking on the respective department</p>
		</div>
		
		<div class="departments">
			<ul>
				<c:forEach var="department" items="${departments}">
					
					<li>
						<span>${department.departmentId}</span>${department.departmentName}
						<a href="DetailsServlet?departmentId=${department.departmentId}">View Department</a>
					</li>
					
				</c:forEach>
			</ul>
		</div>
		
	</div>
</body>
</html>