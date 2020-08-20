package cse215_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame {
    private Container c;
    private JLabel username,password;
    private JPasswordField p;
    private JTextField tf,tf1;
    private JButton jb1,jb2;
    private Cursor cp;
    Login()
    {
        
        initComponents();
    }
    public void initComponents()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        username=new JLabel();
        username.setText("Enter User Name:");
        username.setBounds(30,20,100,50);
        c.add(username);
        password=new JLabel();
        password.setText("Enter Password :");
        password.setBounds(30,80,100,50);
        c.add(password);
        tf=new JTextField();
        tf.setBounds(150,20,100,50);
        tf.setBackground(Color.PINK);
        c.add(tf);
        p=new JPasswordField();
        p.setEchoChar('*');
        p.setBackground(Color.PINK);
        p.setBounds(150,80,100,50);
        c.add(p);
        cp=new Cursor(Cursor.HAND_CURSOR);
        jb1=new JButton("LOGIN");
        jb1.setBounds(30, 200, 100, 50);
        c.add(jb1);
        jb2=new JButton("CLEAR");
        jb2.setBounds(200, 200, 100, 50);
        c.add(jb2);
        jb1.setCursor(cp);
        jb2.setCursor(cp);
        
        
       jb1.addActionListener(new ActionListener(){
           
           
           @Override
           public void actionPerformed(ActionEvent e)
           {
               String username=tf.getText();
               String password=p.getText();
               if(username.equals("Faisal") && password.equals("123") ||(username.equals("Raiyan Khan")&& password.equals("123")|| (username.equals("Zahid")&& password.equals("123")|| username.equals("Asif")&& password.equals("123"))) )
               {
                   JOptionPane.showMessageDialog(null, "You are Login Succesfully");
                   dispose();
                   Selection frame=new Selection();
                   frame.setVisible(true);
                   frame.setSize(500,500);
                   
                   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                   frame.setLocationRelativeTo(null);
                   
                   
                  
                   
               }
               else
               {
                   
                   JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
               }
               
               
           }
           
           
           
       });
       jb2.addActionListener(new ActionListener(){
           
           @Override
           public void actionPerformed(ActionEvent e)
           {
               tf.setText("");
               p.setText("");
               
               
               
           }
           
           
           
           
       });
        
        
        
    }
    
    public static void main(String[] args) {
        Login frame=new Login();
        frame.setVisible(true);
        
    
}
}
