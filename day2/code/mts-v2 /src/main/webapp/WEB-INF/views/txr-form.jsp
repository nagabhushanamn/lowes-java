<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mts</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">

	<div class="page-header">MTS-app</div>
	
	<div class="col-md-6">
		<div class="panel panel-default"> 
			<div class="panel-heading"> Txr Form </div>
			<div class="panel-body">
				<form action="txr.htm" method="post">
					<div class="form-group"> 
						<label>From </label>
						<input class="form-control" name="fromAccNum">
					</div>
					<div class="form-group"> 
						<label>To </label>
						<input class="form-control" name="toAccNum">
					</div>
					<div class="form-group"> 
						<label>Amount </label>
						<input class="form-control" name="amount">
					</div>
					<button class="btn btn-primary">Txr</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>