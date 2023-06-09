<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SELECT JOB</title>
</head>
<body BGCOLOR="#4EE2EC" >
<form method="post" action="interview.jsp">
<% 
try{
	String b1=(String)session.getAttribute("a1");
	String b2=(String)session.getAttribute("a2");
	String b3=(String)session.getAttribute("a3");
	//out.println(b1);
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
	Statement s =c.createStatement();
	String sql ="select * from job where location='"+b1+"' and job_desc='"+b2+"' and sel_post='"+b3+"'";
	ResultSet rs=s.executeQuery(sql);
	rs.next();
%><table BORDER=10 WIDTH=200 HEIGHT=150 BGCOLOR="WHITE" align="center">

<tr>

	
	<td><FONT SIZE="4"COLOR="blue" FACE="roman">Company:<%out.println(rs.getString(1));%></FONT><br></td></tr>
	<tr>
	<td><FONT SIZE="4"COLOR="blue" FACE="roman">Vacancies:<%out.println(rs.getString(3));%></FONT><br>
	</td></tr>
	<tr><td><FONT SIZE="4"COLOR="blue" FACE="roman">Salary:   <%out.println(rs.getString(4));%></FONT><br></td></tr>
	<tr><td><FONT SIZE="4"COLOR="blue" FACE="roman">Job Post: <%out.println(rs.getString(7));%></FONT><br></td></tr>
	<tr><td><FONT SIZE="4"COLOR="blue" FACE="roman">Location: <%out.println(rs.getString(6));%></FONT><br></td></tr>
	
	
</table>
<INPUT type="submit" value="APPLY" align="center">
	<%
}catch(Exception e ){out.println(e);
}

%>
</form>
<form method="post" action="app_home.jsp">
<INPUT type="submit" value="BACK" ><BR>

</form>
</body>
</html>