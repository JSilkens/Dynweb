<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="model.Radio"%>
<%@page import="model.Stream"%>
<%@page import="java.util.Collection"%>
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
<script src="//code.jquery.com/jquery-1.10.2.js"></script>

<title>Radioplayer - Player</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div align="left">
			<audio controls="controls"> <source
				src="http://193.190.253.57:8000/stream" type="audio/mpeg" /> Your
			browser does not support the audio element. </audio>
		</div>


		<div align="right">
			<p>
				<strong>Stations</strong>
			</p>
			<p>
				<strong>Total: </strong>
				<%
					String total = (String) request.getAttribute("total");
					if (total != null) {
				%>
				<%=total%>
				<%
					}
				%>
			</p>
			<div class="table-responsive">
				<table class="table table-striped table-bordered">
					<thead>
						<tr>
							<th>Name</th>
							<th>Link</th>
							<th>Rating</th>
						</tr>
						<%
							System.out.println("Test");
							Collection<Stream> totalstreams = (Collection<Stream>) request
									.getAttribute("streams");
							System.out.println("Test2");
							if (totalstreams != null) {
									System.out.print("Showing streams");
								for (Stream str : totalstreams) {
						%>
						<tr>
							<td><%=str.getStationName()%></td>
							<td><%=str.getUrl().substring(0, 15)%></td>
							<td><%=str.getRating()%></td>
						</tr>
						<%
							}
							}
						%>
					</thead>
				</table>
			</div>
			<a href="addstation.jsp"><button type="button"
					class="btn btn-primary">Add station</button></a>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>