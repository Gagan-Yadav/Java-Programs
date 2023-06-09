package Scholarship_Portal;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
class Project3 implements ActionListener {
	  JFrame f;
	  JButton b1;
	 JLabel l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	 JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15;
  Project3(){
	  f = new JFrame("next page");
	  f.setLayout(null);
	  f.setSize(1200,2000);
	   f.setLocation(80,50);
	  f.setVisible(true);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  b1 = new JButton("Submit");
	  b1.setBounds(300,450,90,30);
	 b1.addActionListener(this);
	 f.add(b1);
     l3 = new JLabel("Name:");
     l3.setBounds(50,5,50,50);

     f.add(l3);
     l4 = new JLabel("Father Name:");
     l4.setBounds(500,5,80,50);f.add(l4);
     l5 = new JLabel("Mother Name:");
     l5.setBounds(50,50,100,50);f.add(l5);
     l6 = new JLabel("Moblie No:");
     l6.setBounds(500,50,80,50);f.add(l6);
     l7 = new JLabel("Gender:");
     l7.setBounds(50,100,50,50);f.add(l7);
     l8 = new JLabel("D.O.B:");
     l8.setBounds(500,100,50,50);f.add(l8);
     l9 = new JLabel("Category:");
     l9.setBounds(50,150,80,50);f.add(l9);
     l10 = new JLabel("Income:");
     l10.setBounds(500,150,50,50);f.add(l10);  
     l11 = new JLabel("Aadhar NO:");
     l11.setBounds(50,200,80,50);f.add(l11);
     l12 = new JLabel("Religion:");
     l12.setBounds(500,200,100,50);f.add(l12);
     l13 = new JLabel("Account NO:");
     l13.setBounds(50,250,100,50);f.add(l13);
     l14 = new JLabel("Ifsc code:");
     l14.setBounds(500,250,100,50);f.add(l14);
     l15 = new JLabel("Percentage:");
     l15.setBounds(50,300,130,50);f.add(l15);
     l16= new JLabel("student enroll ID:");
     l16.setBounds(480,300,110,50);f.add(l16);
     l17 = new JLabel("Address:");
     l17.setBounds(300,350,80,50);f.add(l17);    
  
     
     
     
   
     tf1 = new JTextField();
     tf1.setBounds(250,15,130,25);f.add(tf1);
     tf2 = new JTextField();
     tf2.setBounds(650,15,130,25);f.add(tf2);
     tf3 = new JTextField();
     tf3.setBounds(250,60,130,25);f.add(tf3);
     tf4 = new JTextField();
     tf4.setBounds(650,60,130,25);f.add(tf4);
     tf5 = new JTextField();
     tf5.setBounds(250,115,130,25);f.add(tf5);
     tf6 = new JTextField();
     tf6.setBounds(650,115,130,25);f.add(tf6);
     tf7 = new JTextField();
     tf7.setBounds(250,160,130,25);f.add(tf7);
     tf8 =  new JTextField();
     tf8.setBounds(650,160,130,25);f.add(tf8);
     tf9 = new JTextField();
     tf9.setBounds(250,210,130,25);f.add(tf9);
     tf10 = new JTextField();
     tf10.setBounds(650,210,130,25);f.add(tf10);
     tf11 = new JTextField();
     tf11.setBounds(250,260,130,25);f.add(tf11);
     tf12 =  new JTextField();
     tf12.setBounds(650,260,130,25);f.add(tf12);
     tf13 = new JTextField();
     tf13.setBounds(250,310,130,25);f.add(tf13);
     tf14 = new JTextField();
     tf14.setBounds(650,310,130,25);f.add(tf14);
     tf15= new JTextField();
     tf15.setBounds(450,350,300,60);f.add(tf15);}    
    
    public void actionPerformed(ActionEvent i1){
	
		String aa=tf1.getText();
		String bb=tf2.getText();
		String cc=tf3.getText();
		String dd=tf4.getText();
		String ee=tf5.getText();
		String ff=tf6.getText();
		String gg=tf7.getText();
		String hh=tf8.getText();
		String ii=tf9.getText();
		String jj=tf10.getText();
		String kk=tf11.getText();
		String ll=tf12.getText();
		String mm=tf13.getText();
		String nn=tf14.getText();
		String oo=tf15.getText();
		if(i1.getSource()==b1) {
			try { Mysql M = new Mysql(); 
		 String q = "insert into project values('"+aa+"','"+bb+"','"+cc+"','"+dd+"','"+ee+"','"+ff+"','"+gg+"','"+hh+"','"+ii+"','"+jj+"','"+kk+"','"+ll+"','"+mm+"','"+nn+"','"+oo+"')";
		    M.s.executeUpdate(q);
		 
		  f.setVisible(false);
		    }    
		             catch(Exception tt) {System.out.println("error"+tt);}}}
public static void main(String[]a)
{
	Project3 p3 = new Project3();
}
}