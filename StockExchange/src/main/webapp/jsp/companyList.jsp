<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockexchange.model.Company"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>


<table>
<tr>
<td>Company Code</td>
<td>Company Name</td>
<td>Turn Over</td>
<td>CEO</td>
<td>Board of Directors</td>
<td>Sector Id</td>
<td>Brief Writeup</td>
<td>Stock code</td>
</tr>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyCode() %></td>
<td><%= e.getCompanyName() %></td>
<td><%= e.getTurnOver() %></td>
<td><%= e.getCeo() %></td>
<td><%= e.getBoardOfDirectors() %></td>
<td><%= e.getSectorId() %></td>
<td><%= e.getBriefWriteup() %></td>
<td><%= e.getStockCode() %></td>


</tr>
<% }%>

</table>


</table>

</body>
</html>