<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML><HEAD><FONT SIZE="4"COLOR="blue" FACE="roman">CANDIDATE HOME PAGE
</FONT><br>
<FONT SIZE="4"COLOR="blue" FACE="roman">WELCOME
  <%=session.getAttribute("t1") %></FONT>
<TITLE>APPLICANT HOME PAGE</TITLE>
<META content="text/html; charset=windows-1252" http-equiv=Content-Type>
<META name=GENERATOR content="MSHTML 9.00.8080.16413"></HEAD>
<BODY BGCOLOR="#4EE2EC" >




<form NAME="CREATEACCTFORM" action="app_home.jsp"  METHOD="POST" >
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
	

	

	<table width="100%" border="0" cellpadding="7" cellspacing="0" class="bg_white">

	
	  
<tr>
				<td width="400" align="right" bgcolor="#736AFF">Search Jobs</td>
				
			</tr>

			   <tr>
				
					
			            <table border="0" align="center" cellpadding="0" cellspacing="0">
            			<tr>
            			
           				 <span id="email_msg">

           				 </span>
           				
           				 </tr>

           				 </table>
        				

			
				  <div id="EMAILID" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>
					<div id="ERR_EMAIL" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>

			</tr>
			   

			<tr>
				<td align="right" valign="top">Location: </td>

				<td valign="top" >
				
				<select  name="loc" style="width:165" ><option > - Select -</option><option >DELHI</option><option>BANGLORE</option><option>CHENNAI</option><option>GURGAON</option><option>HYDERABAD</option><option>MUMBAI</option><option>KOLKATA</option><option>PUNE</option><option>NOIDA</option><option>KANPUR</option></select>	

				<br>
				
				</tr>


<tr>
				<td align="right" valign="top"><span class="txt_orange"></span> Skills:&nbsp</td>
				<td valign="top"  ><select  name="SKILLS" style="width:165" ><option > - Select - </option><option>ITI</option><option>C</option><option>C++</option><option>JAVA</option><option>GOOD TYPING SPEED</option></select>	
				<br>
					<div id="UNAME" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>

					<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>

			  </tr>
			  <tr>
				<td align="right" valign="top"><span class="txt_orange"></span>Functional Area:  </td>
				<td valign="top"  >
					<div id="UNAME" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>
				
					<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>

			  </tr><tr>
			  <select name="area"  style="width:165" id="industry"  ><option> - Select - </option><option>Any</option><option>Automotive</option><option>Banking</option><option >Bio Technology</option><option>Chemicals</option><option>Construction</option><option>Consumer Goods</option><option>Education</option><option>Entertainment</option><option>Insurance</option><option>BPO</option><option>Hardware</option><option>Software</option></select>
				<br>
				<td align="right" valign="top"><span class="txt_orange"></span> Key Word:  </td>
				<select name="key" style="width:165" ><option> - Select - </option><option>Sales Executive</option><option>Teacher</option><option>Manager</option><option>Accounting</option><option>Technician</option><option> Software Professional</option><option>Software Tester</option><option>IT Professional</option></select>	
				
				<td valign="top"  ><br>
				<input maxlength="255" size="30" name="userName"   type="submit" value="SEARCH" >
					<div id="UNAME" style="width:250px; margin-left:205px; margin-top:-20px; _margin-left:20px; _margin-top:0px; position:absolute;"></div>

					<div id="ERR_UNAME" style="padding: 2px; width: 400px; display: none;" class="txt_red small_1"></div>
				</td>

			  </tr>
			 
		
				

		</table>


<%
String s1=request.getParameter("loc");
String s2=request.getParameter("area");
String s3=request.getParameter("key");
session.setAttribute("a1",s1);
session.setAttribute("a2",s2);
session.setAttribute("a3",s3);
if(s1!=null && s2!=null && s3!=null){
try{
	
	//String s1=request.getParameter("loc");
	//String s2=request.getParameter("area");
	//String s3=request.getParameter("key");
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c=DriverManager.getConnection("jdbc:odbc:abc","root","root");
	Statement s =c.createStatement();
	String sql = "select * from job where location='"+s1+"' and job_desc='"+s2+"' and sel_post='"+s3+"'";
	//out.println(s1);
	//out.println(s2);
	//out.println(s3);
	ResultSet rs=s.executeQuery(sql);
	if(rs.next())
	{
		%>
			<jsp:forward page="job-selct.jsp"/>
		<%
	}
	else
	{
		%><script type="text/javascript" language="javascript">
		  alert("SORRY,NO SUCH JOB AVAILABLE.");
		  </script>
		 <%
	}
	out.println("success");
}catch(Exception e ){out.println(e);
}
}
%>
</table>
</form>
<form method="post" action="view.jsp">
<input maxlength="255" size="30" value="VIEW APPLICATIONS" type="submit" >
</form>
<form method="post" action="LOGIN_A.jsp">
<input maxlength="255" size="30" value="LOGOUT" type="submit" >
</form>
</body>
</html>