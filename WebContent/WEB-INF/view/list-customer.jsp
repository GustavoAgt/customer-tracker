<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CCR System</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<script src="${pageContext.request.contextPath}/resources/js/utils.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2></h2>
		</div>
	</div>
	
	<div class="container">
		<div class="content">
			<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">First Name</th>
				      <th scope="col">Last Name</th>
				      <th scope="col">Email</th>
				    </tr>
				  </thead>
				  <tbody>
				  
				  <c:forEach var="tempCustomer" items="${customers}">
				  	  <tr>
				      <th scope="row"><script>document.write(listIterationValue())</script></th>
				      <td>${tempCustomer.firstName}</td>
				      <td>${tempCustomer.lastName}</td>
				      <td>${tempCustomer.email}</td>
				    </tr>
				  </c:forEach>
				  
				  </tbody>
			</table>
		</div>
	</div>
</body>
</html>