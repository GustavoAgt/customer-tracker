<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CRM System</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
	<script src="${pageContext.request.contextPath}/resources/js/utils.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2></h2>
		</div>
	</div>
	
	<div class="container space-container">
		<div class="row">
			<div class="col-md-2">
				
			</div>
			<div class="col-md-8">
				<button type="submit" class="btn btn-primary space-button" onclick="window.location.href='showFormForAdd'">Add Customer</button>
				<div class="content">
					<table class="table">		  
						  <thead class="thead-light">
						    <tr>
						      <th scope="col">#</th>
						      <th scope="col">First Name</th>
						      <th scope="col">Last Name</th>
						      <th scope="col">Email</th>
						      <th scope="col"></th>
						      <th scope="col"></th>
						    </tr>
						  </thead>
						  <tbody>
							  <c:forEach var="tempCustomer" items="${customers}">
							  	<spring:url value="${tempCustomer.id}/update" var="updateUrl"></spring:url>
							  	<spring:url value="list/${tempCustomer.id}/delete" var="deleteUrl"></spring:url>
							  	  <tr>
							      	<th scope="row"><script>document.write(listIterationValue())</script></th>
							      	<td>${tempCustomer.firstName}</td>
							      	<td>${tempCustomer.lastName}</td>
							      	<td>${tempCustomer.email}</td>
							      	<td><button class="btn btn-info" onclick="location.href='${updateUrl}'">Update</button></td>
							      	<td><form action="${deleteUrl}" method="POST"><input type="submit" class="btn btn-danger" onclick="if(!(confirm('Are you sure you want to delete this customer?')))return false;" value="Delete"  /></form></td>
							    </tr>
							  </c:forEach>
						  </tbody>
					</table>
				</div>
			</div>
			<div class="col-md-2">
			
			</div>
		</div>
	</div>
</body>
</html>