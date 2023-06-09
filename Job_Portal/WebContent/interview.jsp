<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" src="cal2.js">
/*
Xin's Popup calendar script-  Xin Yang (http://www.yxscripts.com/)
Script featured on/available at http://www.dynamicdrive.com/
This notice must stay intact for use
*/
</script>
<script language="javascript" src="cal_conf2.js"></script>
</head>
<body BGCOLOR="#4EE2EC">
<form action="app_home.jsp" method="post">
<%
try{
	String c1=(String)session.getAttribute("t1");
	String b1=(String)session.getAttribute("a1");
	String b2=(String)session.getAttribute("a2");
	String b3=(String)session.getAttribute("a3");
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
	Statement s =c.createStatement();
	String sql ="select * from job where location='"+b1+"' and job_desc='"+b2+"' and sel_post='"+b3+"'";
	ResultSet rs=s.executeQuery(sql);
	rs.next();
	%>
	<table BORDER=10 WIDTH=350 HEIGHT=150 BGCOLOR="WHITE" align="center">

<tr>

	
	<td>
<FONT SIZE="4"COLOR="blue" FACE="roman">Username:<%=session.getAttribute("t1") %></FONT><br></td>
<tr><td><FONT SIZE="4"COLOR="blue" FACE="roman">Company:<%out.println(rs.getString(1));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Vacancies:<%out.println(rs.getString(3));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Salary:   <%out.println(rs.getString(4));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Job Post: <%out.println(rs.getString(7));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Location: <%out.println(rs.getString(6));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Interview date: <%out.println(rs.getString(8));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Interview Time: <%out.println(rs.getString(9));%></FONT><br></td></tr>
<tr><td>	<FONT SIZE="4"COLOR="blue" FACE="roman">Interview Place: <%out.println(rs.getString(10));%></FONT><br></td></tr>
</table>
	<% 
	Statement m =c.createStatement();
	String sq1 ="select * from interview where can_uname='"+c1+"' and com_name='"+rs.getString(1)+"'";
	ResultSet rs1=m.executeQuery(sq1);
	boolean a=rs1.next();
	if(a==false)
	{
		out.println("success1");
		out.println(rs.getString(8));
		out.println(rs.getString(9));
		out.println(rs.getString(10));
		Statement p =c.createStatement();
		String sq ="insert into interview values('"+c1+"','"+rs.getString(1)+"','"+rs.getString(8)+"','"+rs.getString(9)+"','"+rs.getString(10)+"')";
		p.execute(sq);
		out.println("success");
	}
	else if(a==true)
	{
		%><script type="text/javascript" language="javascript">
		  alert("YOU HAVE ALREADY REGISTERED FOR THIS COMPANY.");
		  </script>
		 <%
	}
	String m1=request.getParameter("rs.getString(1)");
	session.setAttribute("v1",m1);
	out.println("success");
}catch(Exception e ){out.println(e);
}

%>
<!-- </form>
<form name="sampleform" method="post" action="interview.jsp">
Select interview date:<input type="text" name="firstinput" size=20> <a href="javascript:showCal('Calendar1')">Select Date</a>
<br>

try{
	
	String b1=(String)session.getAttribute("a1");
	String b2=(String)session.getAttribute("a2");
	String b3=(String)session.getAttribute("a3");
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//String p1=request.getParameter("firstinput");
	Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
	Statement s =c.createStatement();
	String sql ="select * from job where location='"+b1+"' and job_desc='"+b2+"' and sel_post='"+b3+"'";
	ResultSet rs=s.executeQuery(sql);
	rs.next();
	Statement p =c.createStatement();
	//String sq ="insert into interview values('"+c1+"','"+rs.getString(1)+"','"++"','"+rs.getString(6)+"','11:00 am')";
	//p.execute(sq);
	
}catch(Exception e ){out.println(e);
}


%>
-->
<INPUT type="submit" value="OK" ><BR>
</form>

<form method="post" action="app_home.jsp">
<INPUT type="submit" value="BACK" ><BR>
</form>
</body>
</html>