package Scholarship_Portal;
import java.sql.*;
 public class Mysql {
	  public Connection c;
	  public Statement  s;
	  
	 public Mysql() {
		try {  
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","gvirus");
	         s=c.createStatement();
	       
	        
		
		}catch(Exception e) {e.printStackTrace();}}}