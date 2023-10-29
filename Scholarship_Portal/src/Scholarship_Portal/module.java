

package Scholarship_Portal;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
class Graphics extends JFrame implements ActionListener
{
JLabel l4;
JTextField t1,t2;
JButton b2;
JButton b1;
Container c;

public Graphics(String s)
{ super(s);}

public void setcom()
{
JLabel l1=new JLabel("Addition  of  two  number");
JLabel l2=new JLabel("first number");
JLabel l3=new JLabel("second number");
l4=new JLabel();
t1=new JTextField();
 t2=new JTextField();
b1=new JButton("Add");
b2 = new JButton("simple");
setLayout(null);

l1.setBounds(50,50,200,20);
l2.setBounds(50,80,100,20);
t1.setBounds(150,80,100,20);
l3.setBounds(50,130,100,20);
t2.setBounds(150,130,100,20);
b1.setBounds(80,180,100,20);
b2.setBounds(80,230,100,20);
l4.setBounds(50,270,200,20);
c =this.getContentPane();



b1.addActionListener(this);
b2.addActionListener(this);

add(l1);
add(l2);
add(l2);
add(t1);
add(l4);
add(t2);
add(b1);
add(b2);
add(l3);
}
public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1){
  JFrame f2 = new JFrame();
f2.setSize(500,500);
f2.setVisible(true);
f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

if(e.getSource()==b2)
  c.setBackground(Color.RED);

}  



public static void main(String[]args)
{
Graphics jf = new Graphics("Graphics");
jf.setcom();
jf.setSize(500,500);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}}
