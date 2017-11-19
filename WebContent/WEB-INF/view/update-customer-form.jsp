<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>CRM Update customer</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
		<script src="${pageContext.request.contextPath}/resources/js/utils.js"></script>
	</head>
	
	<body>
		<div class="container">
			<div class="row space-top">
				<div class="col-md-2"></div>
				<div class="col-md-8">
					<f:form action="updateCustomer" method="POST" modelAttribute="customer">
						<div class="card">
						  <h4 class="card-header">CRM Customer System</h4>
						  <div class="card-body">
						    <h4 class="card-title">Update Customer</h4>
						    	
						    	<f:input class="form-control" path="firstName" placeholder="First Name" />
						    	<f:errors path="firstName" cssClass="color-error-message" />
								<br/>
								
								<f:input class="form-control" path="lastName" placeholder="Last Name" />
								<f:errors path="lastName" cssClass="color-error-message" />
								<br/>
								
								<f:input class="form-control" path="email" placeholder="Email"/>
								<f:errors path="email" cssClass="color-error-message" />
										
								<div class="space-top-customerbuttonform">
						    		<input type="submit" value="Update Customer" class="btn btn-primary"/>	
									<a href="${pageContext.request.contextPath}/customer/list" class="space-left-elements-customerform">Back to Customer List <img src="${pageContext.request.contextPath}/resources/img/action-redo-2x.png"></a>
								</div>
							</div>
						</div>
					</f:form>
				</div>
				<div class="col-md-2">
				</div>
			</div>
		</div>
	</body>
</html>