<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Letter counter</title>
</head>
<body>
	<h1>Letter counter</h1>
	<form method="post" action="Occurences">
		<label for="word"></label> <input type="text" id="word" name="word" />
		<label for="char"></label> <input type="text" id="char" name="char" />
		<input type="submit" value="check">
		<%
			if (request.getAttribute("total") != null) {

				int total = (int) request.getAttribute("total");
		%>
		<p>total occurences:</p>
		<%=total%>

		<%
			}
		%>


	</form>
</body>
</html>