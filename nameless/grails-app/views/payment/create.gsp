<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Create a payment | LeMonJuice</title>
		<script>
		$.noConflict();
		</script>
	</head>
	
	<body>
		<div class = "container">
			<div class = "col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
				<g:form class = "text-center" action="create" name="payment-create-form" enctype="multipart/form-data">
					
					<div class = "row">
						<label for="productName">Product name:</label>
						<g:textField name="productName" required = "true" value="${payment?.productName}" />
						<g:hasErrors  bean="${shop}" field="productName">
							<p class="error"><g:fieldError bean="${payment}" field="productName" /></p>
						</g:hasErrors>
					</div>
					
					<div class = "row">
						<label for="price">Price:</label>
						<g:textField name="price" value="${payment?.price}" />
				        <g:hasErrors  bean="${shop}" field="price">
				            <p class="error"><g:fieldError bean="${payment}" field="price" /></p>
				        </g:hasErrors>
					</div>
					
					<div class = "row">
						<label for="description">Description:</label>
						<g:textArea name="description" value="${payment?.description}" />
				        <g:hasErrors  bean="${shop}" field="description">
				            <p class="error"><g:fieldError bean="${payment}" field="description" /></p>
				        </g:hasErrors>
					</div>
							
					<g:if test="${flash.message}">
						<p class="error">${flash.message}</p>
					</g:if>
					
					<div class="submit">
						<g:submitButton class="btn btn-success" name="payment-create-button" value="Create a payment" />
					</div>
				   			
				</g:form>
			</div>
		</div>
				
<g:javascript>

</g:javascript>
	</body>
</html>
