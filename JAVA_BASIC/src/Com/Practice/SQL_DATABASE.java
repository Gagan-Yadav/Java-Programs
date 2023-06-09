package Com.Practice;
import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class SQL_DATABASE {
	
	public static void withdraw(int amt) {
		
		System.out.println("Withdraw "+amt);
		
	}
	
	public static void connection() {
		
		Connection con = null;
		PreparedStatement ps = null;
		withdraw(27);
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Worked");
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","gvirus");
	System.out.println("connected");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from student");
	Formatter f1 = new Formatter();
	
//	System.out.format("%-15s%"+"1"+"2"+"3"+"\n");
	while(rs.next()) {
		
		System.out.format("%-1d%20s%20s%n", rs.getInt(1),rs.getString(2),rs.getString(3));
//		System.out.format("ID = "+rs.getInt(1)+"\tName = "+rs.getString(2)+"\tCity = "+rs.getString(3));
	}
	/* this code is used to print all records in that table(upper code)
	 * 
	 * lower code(for inserting values
	 */
//	String sql = "insert into student values(27,'gagan','hbd')";
//	ps=con.prepareStatement(sql);
//	ps.execute();
//	System.out.println("success");
	
	con.close();
	
	}
	catch(ClassNotFoundException e) {
		System.out.println(e.getMessage());
	}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static void main(String[] args) throws SQLException {

		connection(); 
		
		
	}	
			
	}



