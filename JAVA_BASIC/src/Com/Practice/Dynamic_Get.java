package Com.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;


public class Dynamic_Get {
	static Scanner s = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);
	
	static Statement st = null;
	static Connection con;
	static ResultSet rs = null;

	static int id = 0; static Double sa; static String na;
	
	
	public static void add() {
//		 System.out.print("\n    !!!  Add Employee  !!!\n");
//    	 System.out.print("\n	Enter Employee ID : ");
//          id=s.nextInt();
         System.out.print("	Enter Employee Name : ");
          na =s1.nextLine();
         System.out.print("	Enter Employee salary : ");
          sa = s.nextDouble();
         try {
			st.executeUpdate("insert into employeed value('"+id+"','"+na+"','"+sa+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println("	\nValues Inserted Succesfully....");
	}
	
	
	public static void check() {
		 System.out.print("\n    !!!  Add Employee  !!!\n");
    	 System.out.print("\n	Enter Employee ID : ");
          id=s.nextInt();
          
		  try {
				while(rs.next()) {
				 	  int g = rs.getInt("ID"); 
				 	  
					  if(id==g) {
						  System.out.println("Employee Already Exist  !!! \n   Enter Valid ID");
						  check();
					             }
					  else {
						  add();
					  }
				 	 
	      
				  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) throws SQLException {
		
		int j;
		do {
			System.out.println("___________________________________________________________________________________");
		System.out.print("\n 1.  Add Employee \n 2.  Delete Employee\n 3.  View All Employee \n 99. Exit \n\n" );
		System.out.print("Enter Your Choice : ");
		j =s.nextInt();
		System.out.println("___________________________________________________________________________________");	
		
	
		
		
             try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	               con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","gvirus");
//	             System.out.println("Connection Established..");
	               st=con.createStatement();  
	                rs = st.executeQuery("select * from employeed");
	             

			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
             
			if(j==1) {
		

            	 System.out.print("\n    !!!  Add Employee  !!!\n");
            	 System.out.print("\n	Enter Employee ID : ");
	              id=s.nextInt();
	      
	             	  while(rs.next()){
	            	  int g = rs.getInt("ID");   
		  
	   	         if(g==id) {
	            		  System.out.println("Employee Already Exist  !!! \n   Enter Valid ID");  
	            		  check();
	   	         }
	   	         else {
//	   	        	 System.out.print("GOOD");
	   	         }
	              }
	             
	              
	              
	             System.out.print("	Enter Employee Name : ");
	              na =s1.nextLine();
	             System.out.print("	Enter Employee salary : ");
	              sa = s.nextDouble();
	             st.executeUpdate("insert into employeed value('"+id+"','"+na+"','"+sa+"')");
	             System.out.println("	\nValues Inserted Succesfully....");

//	             check();
            	 
            	 
		}else if(j==2) {
			System.out.print("      !!!  Delete Employee  !!!\n");
			System.out.print("	Enter Employee ID : ");
			int k = s.nextInt();
            st.executeUpdate("delete from employeed where ID = '"+k+"'");
			System.out.print("\n    !!! Successfully Deleted  !!! ");



			
		}else if(j==3) {
			System.out.println("	!!!  All Employees  !!! \n");
			System.out.println("   ID          	Name			Salary");
			
			while(rs.next()) {
				int id1 = rs.getInt("ID");
				String n1 =rs.getString("Name");
				Double d1 = rs.getDouble("Salary");
				System.out.println("   "+id1+"     "+n1+" 			"+d1);
//				 f = new Formatter();
//			      System.out.println(f.format("%10d", 9878)); 
//				System.out.println(f.format("%10d", 9878));
			}
		}
		else if(j==99) {
			System.out.print("\n      Thank you...  ");
			System.exit(0);
		}
		else
		{
			System.out.println("  \n Invalid Choice !, Please Select Correct Option ");
		
		}
		}while(j!=99); 
	}

}
