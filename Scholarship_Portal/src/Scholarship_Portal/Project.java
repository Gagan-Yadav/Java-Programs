package Scholarship_Portal;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;
import java.awt.*;
class Project  implements ActionListener {
      JFrame f;
      JLabel l1,l2;
      JButton b1,b2,b3;
	  Project(){
		  f = new JFrame("Scholarship portal");
		  f.setBackground(Color.BLUE);
          f.setLayout(null);
          b1 = new JButton("ABOUT THE SCHLOASHIP");
          b1.setBounds(500,200,200,70);
          b1.addActionListener(this);
          f.add(b1);
          b2=new JButton("STUDENT LOGIN");
          b2.setBounds(500,300,200,70);
          b2.addActionListener(this);
          f.add(b2);
          b3=new JButton("ADMIN LOGIN");
          b3.setBounds(500,400,200,70);
          b3.addActionListener(this);
          f.add(b3);
	 l1=new JLabel("DAVV  SCHOLARSHIP  PORTAL");
	 l1.setBounds(30,30,700,40);
	 Font f1 = new Font("Arial",Font.PLAIN,40);
	 l1.setFont(f1);
	 f.add(l1);
	  l2 = new JLabel("WELCOME TO DAVV SCHLOARSHIP PORTAL");
	  l2.setBounds(250,150,850,40);
	  Font f2 = new Font("Arial",Font.PLAIN,30);
	   l2.setFont(f2);
	  f.add(l2);  
	  f.setLocation(100,50);  
	  f.setVisible(true);
	  f.setSize(1000,1500);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.getContentPane().setBackground(Color.BLUE);}
	  public void actionPerformed(ActionEvent e)
	  {
	   if(e.getSource()==b1||e.getSource()==b2) {
		   f.setVisible(false);
		   Project1 p1 = new Project1();
	   }
	  }
	 
	 public static void main(String[]args)
	 {Project jf = new Project();
	 
	 
	 }}



