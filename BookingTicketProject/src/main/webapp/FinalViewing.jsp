<%@page import="pojo.Booking"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container-fluid card"style="width:40rem;">
<h1 class="bg-danger text-white text-center">ALL BOOKINGS</h1>
<table class="table table-hover">
<tr>
<th>Passenger ID</th>
<th>Passenger Name</th>
<th>Passenger Source</th>
<th>Passenger Destination</th>
</tr>
<%
List<Booking> booking=(List<Booking>)request.getAttribute("result");
for(Booking b:booking)
{
%>
<tr>
<td><%=b.getPid() %></td>
<td><%=b.getPname() %></td>
<td><%=b.getPsource() %></td>
<td><%=b.getPdestination() %></td>
</tr>
<%} %>

</table>
</body>
</html>