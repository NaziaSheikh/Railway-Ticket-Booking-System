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
<h1 class="bg-danger text-white text-center">RAILWAY TICKET BOOKING SYSTEM</h1>
<form action="book">
<table class="table table-hover">
	<tr>
	<td>Enter the Passenger ID no. : </td>
	<td><input type="text" name="id"></td>
	</tr>
	
	<tr>
	<td>Enter the Passenger Name : </td>
	<td><input type="text" name="name"></td>
	</tr>
	
	<tr>
	<td>Enter the Passenger Source : </td>
	<td><input type="text" name="source"></td>
	</tr>
	
	<tr>
	<td>Enter the Passenger Destination : </td>
	<td><input type="text" name="destination"></td>
	</tr>
	  <tr>
        <td><input type="submit" value="Book Ticket"></td>
       
       </tr>
</table>
</form>
<form action="view">
<table>
<tr>
<td>To view the booking list : </td>
<td><input type="submit" value="View List"></td>
</tr>
</table>
</form>

<form action="UpdateInfo.jsp">
<table>
<tr>
<td>Update the information : </td>
<td><input type="submit" value="Update Record"></td>
</tr>
</table>
</form>

<form action="DeleteInfo.jsp">
<table>
<tr>
<td>Delete the booking !! : </td>
<td><input type="submit" value="Delete Ticket"></td>
</tr>
</table>
</form>
</body>
</html>