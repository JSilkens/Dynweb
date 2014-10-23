<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Radio Player - Add station</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<h2>Add a radio station</h2>
		<form role="form" method="POST" action="../RadioHandler">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" name="name" id="name"  placeholder="Enter the name of the station">
			</div>
			<div class="form-group">
				<label for="link">Link:</label> <input type="text"
					class="form-control" name="link" id="link" placeholder="Paste or type the link here">
			</div>
			
			<button type="submit" class="btn btn-primary">Add station</button>
		</form>
		 <a
			href="radioplayer.jsp"><button type="button"
				class="btn btn-default">Go back to player</button></a>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>