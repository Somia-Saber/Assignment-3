
package assignment.pkg3;

import java.awt.Color;
import javax.swing.*;


public class design extends JFrame{
    JPanel p1;
    JLabel l1;
     JLabel l2;
     JTextField t1;
     JPasswordField t2;
     JButton b1;
     
    public design(){
        setVisible(true);
        setSize(600,300);
        setLocation(500,300);
       setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    p1=new JPanel();
    this.add(p1);
    
   
    
    l1=new JLabel("Username");
    this.add(l1);
    l1.setBounds(120, 55, 120, 25);

    
    l2=new JLabel("Password");
    this.add(l2);
    l2.setBounds(120, 115, 120, 25);
    
    t1=new JTextField();
    this.add(t1);
     t1.setBounds(230, 55, 200, 30);
    
     
     
  t2=new JPasswordField();
    this.add(t2);
     t2.setBounds(230, 115, 200, 30);
   
    
     b1=new JButton("Login");
     this.add(b1);
      b1.setBounds(120, 180, 70, 25);
   
    }
}
