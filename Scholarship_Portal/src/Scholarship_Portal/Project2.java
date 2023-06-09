package Scholarship_Portal;
import javax.swing.*;

import java.awt.event.*;
import java.sql.*;

class Project2 implements ActionListener {
	JFrame f1;
    JButton b1,b2;
    Project2(){
    	f1 = new JFrame("next page");
    	f1.setLayout(null);
    	f1.setSize(1000,1500);
    	f1.setLocation(100,50);
    	f1.setVisible(true);
    	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	b1 = new JButton("notname");
    	b1.setBounds(150,500,100,70);
    	b1.addActionListener(this);
    	f1.add(b1);
    	b2 = new JButton("Back");
    	b2.setBounds(150,70,100,30);
   	    b2.addActionListener(this);
   	    f1.add(b2);
    	JTextArea t = new JTextArea("rulejfjjkll");
    	t.setBounds(200,200,400,200);
    	f1.add(t);
    }
    public void actionPerformed(ActionEvent e1)
	  {
	   if(e1.getSource()==b1) {
		   f1.setVisible(false);
		   new Project3();}
	   if(e1.getSource()==b2) {
		 f1.setVisible(false);   
	   
		   new Project1();}
	  }
    public static void main(String[]a)
    {
    Project2 p2 = new Project2();
    }
}
