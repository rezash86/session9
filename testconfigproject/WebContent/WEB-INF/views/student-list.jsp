<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>

	<div align="center">
		Cool Student List
		<table border="1">
			<tr>
				<th>first name</th>
				<th>last name</th>
				<th>age</th>
				<th>part time</th>
				<th>Gender</th>
			</tr>

			<c:forEach var="student" items="${studList}">
				<tr>
					<td><c:out value="${student.firstName}"></c:out></td>
					<td><c:out value="${student.lastName}"></c:out></td>
					<td><c:out value="${student.age}"></c:out></td>
					<td><c:out value="${student.partTime}"></c:out></td>
					<td><c:out value="${student.gender}"></c:out></td>
					<td><a href="updatestudent?studentId=${student.id}">update me</a></td>
					<td><a href="deletestudent?studentId=${student.id}">delete me</a></td>
				</tr>
			</c:forEach>

		</table>

		<div>
			<br></br> <br></br>
		</div>

		<div align="left">
			<form:form action="saveStudent" method="post"
				modelAttribute="student">
				<table>
					<tr>
						<td>First Name</td>
						<td><form:input path="firstName" /></td>
					</tr>

					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName" /></td>
					</tr>

					<tr>
						<td>Age</td>
						<td><form:input path="age" /></td>
					</tr>

					<tr>
						<td>Part-time</td>
						<td><form:checkbox path="partTime" /></td>
					</tr>

					<tr>
						<td>Gender</td>
						<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
								path="gender" value="F" />Female</td>
					</tr>

					<tr>
						<td colspan="2"><input type="submit" value="Save"></td>
					</tr>
				</table>

			</form:form>
		</div>

	</div>




</body>
</html>