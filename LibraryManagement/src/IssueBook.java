
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


public class IssueBook extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    Date date=new Date();
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    String  checkAvailability,SName,Address,SStream,SClass;
    
    public IssueBook() {
        initComponents();
    }

    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                OnCreate(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Issue Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setText("Student Id");

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Student Name");

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        t2.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel4.setText("Book Id");

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        
        

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel5.setText("Book name");

        t4.setFont(new java.awt.Font("Tahoma", 0, 14));
        t4.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel6.setText("Issue Date");
        
        

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        t5.setEnabled(false);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Issue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); 
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Return Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Student Registration");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        
        
        
        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setEnabled(false);
        
        

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(316, 316, 316))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(296, 296, 296)))
                                .addGap(252, 252, 252))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(83, 83, 83)
                                            .addComponent(jButton1)
                                            .addGap(112, 112, 112)
                                            .addComponent(jButton2))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButton3)
                                            .addGap(45, 45, 45)
                                            .addComponent(jButton4)
                                            .addGap(50, 50, 50)
                                            .addComponent(jButton5)
                                            .addGap(55, 55, 55)
                                            .addComponent(jButton6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(132, 132, 132)))))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(19, 19, 19))
        );

        pack();
    }

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }

    private void OnCreate(java.awt.event.WindowEvent evt) {
        
    }
    
    
    private void t1KeyReleased(java.awt.event.KeyEvent evt) {
        try
        {
            connect();
            query="select * from student where StudentId='"+t1.getText()+"';";
            rs=stmt.executeQuery(query); 
            if(rs.next())
            {
                SName=rs.getString("StudentName");
                Address=rs.getString("Address");
                SStream=rs.getString("SStream");
                SClass=rs.getString("SClass");
                t2.setText(SName);
            }
            else
                t2.setText("");
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t5.setText(format.format(date));
    }
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(t2.getText().equals("")) 
            JOptionPane.showMessageDialog(this,"मान ना मान मैं तेरा मेहमान\nama yaar pehle registration to karwao");
        else
        {
                try
                    {
                        connect();
                        query="select * from books where BookId='"+t3.getText()+"';";
                        
                        rs=stmt.executeQuery(query); 
                        rs.next();
                        if(t6.getText().equals("YES"))
                        {
                        	 JOptionPane.showMessageDialog(this,"Book with id = "+t3.getText()+" has been issued to "+t2.getText());
                             query="update books set Available='NO' where BookId='"+t3.getText()+"';";
                             stmt.executeUpdate(query);
                       
                            query="insert into issued values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+Address+"','"+t5.getText()+"','"+SStream+"','"+SClass+"');";
                            
                            
                            stmt.executeUpdate(query);
                      
                           
                            
                            
                        }
                        if(t6.getText().equals("NO"))
                        {
                            JOptionPane.showMessageDialog(this,"Book with this id is not available currently");
                        }
                        if(t6.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(this,"There is no book in the library with this id");
                        }
                        
                            t4.setText("");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t5.setText("");
                            t6.setText("");
                        disconnect();

                    }
                    catch(SQLException e)
                    {
                        if(e.getErrorCode()==1062)
                        JOptionPane.showMessageDialog(this,"A student can only get a single book from library at a time ");
                    }
                }
                
                
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterStudent r=new RegisterStudent();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed



    private void t3KeyReleased(java.awt.event.KeyEvent evt) {
        try
        {
            connect();
            query="select * from books where BookId='"+t3.getText()+"';";
            rs=stmt.executeQuery(query); 
            if(rs.next())
            {
                t6.setText(rs.getString("Available"));
            t4.setText(rs.getString("BookName"));
            }
            else
            {
                t6.setText("");
                t4.setText("");
            }
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    public void connect()
    {
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/library","root","gvirus");  
            stmt=con.createStatement(); 
        }
        catch(Exception e)
        { 
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"connection error");
        }
    }
    public void disconnect()
    {
        try
        {
           con.close(); 
        }
        catch(Exception e)
        {}

    }
    
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    
}
