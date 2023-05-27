<%@page import="dto.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Dto> l1=(List<Dto>)request.getAttribute("list");%>
<table>
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>gender</th>
<th>number</th>
<th>Delete</th>
</tr>
<%for(Dto d:l1){ %>
<tr>
<td><%=d.getId() %></td>
<td><%=d.getName() %></td>
<td><%=d.getMail() %></td>
<td><%=d.getGender() %></td>
<td><%=d.getPh_no() %></td>
<td><a href="delete?id=<%=d.getId()%>">Delete</a></td>
<%} %>
</tr>

</table>
</body>
</html>