<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th>first name</th>
				<th>last name</th>
				<th>age</th>
			</tr>

			<c:forEach var="student" items="${studList}">
				<tr>
					<td>"${student.firstName}"</td>
					<td>"${student.lastName}"</td>
					<td>"${student.age}"</td>
				</tr>
			</c:forEach>

		</table>


	</div>

</body>
</html>