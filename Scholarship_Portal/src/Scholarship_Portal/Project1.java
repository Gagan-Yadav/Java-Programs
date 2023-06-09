package Scholarship_Portal;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Project1 implements ActionListener{
	JFrame f;
	JButton b1,b2,b3,b4;
 Project1(){
	 f = new JFrame("second page");
	 f.setLayout(null);
	 f.setLocation(100,50);
	 f.setSize(1000,1500);
	 f.setVisible(true);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 b1= new JButton("HOME");
	 b1.setBounds(150,70,100,30);
	 b1.addActionListener(this);
	 f.add(b1);
	 b2 = new JButton("MEDHAVI SCHOLARSHIP");
	 b2.setBounds(500,100,200,50);
	 b2.addActionListener(this);
	 f.add(b2);
	 b3 = new JButton("MINORITY SCHOLARSHIP");
	 b3.setBounds(500,250,200,50);
	 b3.addActionListener(this);
	 f.add(b3);
	 b4 = new JButton("OBC,SC,ST SCHOLARSHIP");
	 b4.setBounds(500,400,200,50);
	 b4.addActionListener(this);
	 f.add(b4);}
	 public void actionPerformed(ActionEvent e1)
	  {
	   if(e1.getSource()==b2||e1.getSource()==b3||e1.getSource()==b4) {
		   f.setVisible(false);
			  new Project2();}
			  if(e1.getSource()==b1) {
		 		  
			    new Project();}}
	   
	public static void main(String[]a) {
		Project1 p1 = new Project1();
	}}