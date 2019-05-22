<%@page import="myemployeeretrivedata.EmployeeprofData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">




</style>







</head>
<body>




<% List<EmployeeprofData> Info=(List<EmployeeprofData>)request.getAttribute("Data");
    
for(EmployeeprofData dis :Info) {

%> 

<tr>


 EMPLOYEE ID : <%=dis.employeeid %> 

<BR>

	 EMPLOYEE NAME:  
<%=dis.employeename %>
<bR>


DATE OF TASK :
<%=dis.date %><bR>

TASK NUMBER :
<%=dis.taskno %><bR>

TASK :
<%=dis.task %><bR>

START TIME :
<%=dis.starttime %><bR>

END TIME:
<%=dis.endtime %><bR>


</tr>


 

<%} %>

</body>
</html>