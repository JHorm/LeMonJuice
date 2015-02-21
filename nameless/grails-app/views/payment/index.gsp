<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>LeMonJuice</title>
		<script>
		$.noConflict();
		</script>
		<script src="http://fortumo.com/javascripts/fortumopay.js" type="text/javascript"></script>
	</head>
	
	<body>
		<div class="container payment">
			<div class="row seller-row">
				<div class="col-md-2">
					<div class="seller-avatar">
						<img class="seller-avatar img-responsive img-circle"
							src="http://placehold.it/100x100">
					</div>
					<div class="seller-contact">
						<h5>Phone: +372 584 787 28</h5>
						<h5>Email: lakusta96@gmail.com</h5>
					</div>
				</div>
				<div class="col-md-2">
					<div class="seller-info">
						<h4>Michael Night</h4>
						<h5 class="seller-rating">30 deals / 99%</h5>
					</div>
				</div>
				<div class="col-md-8">
					<div class="thumbnail">
						<asset:image src="sheep.jpg" class = "img-responsive"/>
					</div>
				</div>
				<div class="row">
					<h1 class="title text-center">${payment.productName}</h1>
					<h2 class="price text-center">${payment.price}</h2>
					<div class="delivery">
						<div class="btn-group">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								Post method <span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li>Omniva post <li />
	                <li>DHL
								<li />  
	                <li>Itella
								<li />
	                <li>Omniva parcel
								<li />
	
	              </ul>
	            </div>
	          </div>
	        </div>
	        <div class="payment-text">
	          <h2>Choose your payment method:</h2>
	        </div>
	
	        <div class = "row">
	        	<div class = "col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 ">
				<g:each in = "${methods}" var = "method">
					<div class = "col-xs-10 col-xs-offset-1 col-sm-4 col-md-offset-0 col-md-3">
						<asset:image src="${method.image}" class = "img-responsive"/>
					</div>
				</g:each>
				<div class = "col-xs-10 col-xs-offset-1 col-sm-4 col-md-offset-0 col-md-3">
					<a id="fmp-button" href="#" rel="e33c9117aa463220969654cc5d27701d">
						<asset:image src="logo-fortumo.jpg" class = "img-responsive"/>
					</a>
				</div>
				</div>
			</div>
	    </div>
	  </div>
<g:javascript>

</g:javascript>

</body>
</html>
