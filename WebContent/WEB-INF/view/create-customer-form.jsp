<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>CRM</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
	</head>
	
	<body>
	
		<div class="row space-top">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<f:form action="saveCustomer" method="POST" modelAttribute="customer">
					<div class="card">
					  <h4 class="card-header">CRM Customer System</h4>
					  <div class="card-body">
					    <h4 class="card-title">Add new Customer</h4>
					    	<label>First name:</label>	<f:input 	class="form-control"	path="${customer.firstName}" />
							<label>Last name:</label>	<f:input  	class="form-control"	path="${customer.lastName}" />
							<label>Email:</label>		<f:input	class="form-control"	path="${customer.email}" />
							<div class="space-top-customerbuttonform">
					    		<input type="submit" value="Save Customer" class="btn btn-primary"/>	
								<a href="${pageContext.request.contextPath}/customer/list" class="space-left-elements-customerform">Back to Customer List <img src="${pageContext.request.contextPath}/resources/img/action-redo-2x.png"></a>
							</div>
						</div>
					</div>
				</f:form>
			</div>
			<div class="col-md-3"></div>
		</div>
	</body>
</html>