package Com.Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;


public class AwtEx {
	
	Image img=Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\Downloads\\473304.jpg");
	
	AwtEx(){
		Frame frame = new Frame("Hello Gt");
		frame.setBackground(Color.lightGray);
		frame.setIconImage(img);
		
		
		
		
//		TextArea textarea= new TextArea();
//		textarea.setBackground(Color.blue);
//		textarea.setBounds(130, 80, 200, 90);
		
		Label label = new Label(" UserName : ");
		label.setBounds(90, 50, 80, 23);
		label.setBackground(Color.green);
		Label label2 =new Label(" PassWord :");
		label2.setBounds(90, 80, 80, 23);
		label2.setBackground(Color.green);
		Label label3 = new Label(" ");
		label3.setBounds(170, 165, 200, 23);
		label3.setBackground(Color.cyan);
		Label l4 = new Label(" ");
		l4.setBounds(220, 110, 2000, 23);
		Label l5 = new Label(" ");
		l5.setBounds(130, 126, 2000, 23);
//		l4.setBackground(Color.red);
		 TextField uname = new TextField();
		 uname.setBounds(190, 50, 180, 23);
		 TextField pass = new TextField();
		 pass.setBounds(190, 80, 180, 23);
		 
		
		
		Checkbox checkbox = new  Checkbox("java");
		checkbox.setBounds(200, 180, 50, 40);
		Checkbox checkbox1 = new  Checkbox("Python");
		checkbox1.setBounds(200, 210, 50, 40);

		
		
		Button button = new Button("Click Me");
		Button reset = new Button("Reset");
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e ) {
				String u =uname.getText();
				String p = pass.getText();
				if(u.equals("gagan@gmail.com")&&p.equals("virus")) {
					System.out.println("Success");
					l4.setVisible(false);
					label3.setText(" Chal nikal");

				}else {
					
					l4.setText("Incorrect Credentials !");
					l5.setText(" Please Login With Valid Username And Password");
					System.out.println("failed");
				}
				
			}
			
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				uname.setText("");
				pass.setText("");
				label3.setText("");
				l4.setText("");
				l5.setText("");
				
			}
			
		});
		
		button.setBounds(150, 255, 80, 30);
		button.setBackground(Color.red);
		button.setForeground(Color.BLACK);
		reset.setBounds(250, 255,80,30);
		reset.setBackground(Color.yellow);
		reset.setForeground(Color.black);
		
		frame.add(button);
		frame.add(reset);
		frame.add(label);
		frame.add(label2);
		frame.add(label3);
		frame.add(l4);
		frame.add(l5);
		frame.add(uname);
//		frame.add(textarea);
		frame.add(checkbox);
		frame.add(checkbox1);
		frame.add(pass);
		
		frame.setSize(600,400);
		frame.setLayout(null);
		frame.setVisible(true);
//		setSize(400,300); // Through Extends Frame class
//		setVisible(true);
//		setLayout(null);
//		Button button = new Button();
//		add(button);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			frame.dispose();
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("window Activate");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("window Deactivated");
			}
			@SuppressWarnings("unused")
			public void WindowClosed(WindowEvent e) {
				System.out.println("Window Closed");
			}
		});
	}
	
	
	public static void main(String[] args) {
		  AwtEx g = new AwtEx();
		  
       
	}

}
























