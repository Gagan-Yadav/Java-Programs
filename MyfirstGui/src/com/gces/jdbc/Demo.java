










//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class GUI implements ActionListener{
//	
//	private int count =0;
//	private JLabel label;
//	private JFrame frame;
//	private JPanel panel;
//	
//	public GUI() {
//		 frame = new JFrame();
//		JButton button = new JButton("Click me");
//		button.addActionListener(this);
//		
//		label = new JLabel("Number Of Clicks : 0");
//		
//		panel = new JPanel();
//		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
//		panel.setLayout(new GridLayout(0, 1));
//		panel.add(button);
//		panel.add(label);
//		
//		frame.add(panel , BorderLayout.CENTER);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Our GUI");
//		frame.pack();
//		frame.setVisible(true);
//	}
//	public static void main(String[] args) {
//		new GUI();
//		
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		count++;
//		label.setText("Number Of Clicks : "+ count);
//
//	}
//}
package com.gces.jdbc;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Demo extends Frame
{
//	DECLARATIONS FOR DATABASE PART
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/sample2";
	public static final String UNAME = "root";
	public static final String PASSWORD = "gvirus";
	String insertQuery;
	
//	for GUI PART
	Label bookNameLabel, authorNameLabel, RollNameLabel;
	TextField bookTextField, authorTextField, RollTextField;
	Button saveButton;

	Demo() 
	{
		prepareGUI();
	}
	// main function
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.dataBaseFunction(); 
	}
	public void prepareGUI()
	{
		this.setTitle("Student Registration System");
		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(new FlowLayout());
		// closable frame
		this.addWindowListener(new WindowAdapter()
				{
					@Override public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				});
		bookNameLabel = new Label("Name :");
		bookTextField = new TextField(" ",50);
		authorNameLabel = new Label("City :");
		authorTextField = new TextField(" ",50);
		RollNameLabel = new Label("Roll Number :");
		RollTextField = new TextField(" ",50);
		saveButton = new Button("SAVE");
		
		this.add(bookNameLabel);
		this.add(bookTextField);
		this.add(authorNameLabel);
		this.add(authorTextField);
		this.add(RollNameLabel);
		this.add(RollTextField);
		this.add(saveButton);
	

		// when user focus on textFields the initial text should be gone. This is for Keyboard focus
		bookTextField.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent f)
				{
					bookTextField.setText("");
				}
			
				public void focusLost(FocusEvent f)
				{
					if(bookTextField.getText().equals(""))
					bookTextField.setText("Enter the name of book");
				}
			});
		
		RollTextField.addFocusListener(new FocusListener()
		{
			public void focusGained(FocusEvent f)
			{
				RollTextField.setText("");
			}
		
			public void focusLost(FocusEvent f)
			{
				if(RollTextField.getText().equals(""))
				RollTextField.setText("Enter your roll number ");
			}
		});
		
		authorTextField.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent f)
				{
					authorTextField.setText("");
				}
			
				public void focusLost(FocusEvent f)
				{
					if(authorTextField.getText().equals(""))
					authorTextField.setText("Enter the name of author");
				}
			});
	}
	//database roles comes when user enter the data and click save button
	public void dataBaseFunction()
	{
		saveButton.addActionListener(new ActionListener() 
			{
				@Override public void actionPerformed(ActionEvent e)
				{
						try 
						{
							insertQuery = "INSERT INTO job(`name`,`city`,'rollnumber`)"+"VALUES(?,?,?)";
							
							Class.forName(JDBC_DRIVER);
							
							Connection con = DriverManager.getConnection(DB_URL,UNAME,PASSWORD);
							
							PreparedStatement pst = con.prepareStatement(insertQuery);
							pst.setString(1,bookTextField.getText());
							pst.setString(2,authorTextField.getText());
							pst.setString(3,RollTextField.getText());

							pst.executeUpdate();
							
							pst.close();
							con.close();
						} 
						catch (ClassNotFoundException e1) {
							System.out.println(e1.getMessage());
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
				}
			});
	}

}

