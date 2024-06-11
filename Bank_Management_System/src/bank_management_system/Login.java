/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;


import com.mysql.cj.protocol.Resultset;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



/**
 *
 * @author Sanket
 */
public class Login extends JFrame implements ActionListener{

    JButton Login,Sign_up,Clear;
    JTextField t1;
    JPasswordField t2;
    Login() {
        
        
        setTitle("ATM");
        
        setLayout(null);
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("Images/Online.png"));
	JLabel image = new JLabel(I1);
        image.setBounds(450,0,700,700);
        add(image);
        
        ImageIcon I2 = new ImageIcon(ClassLoader.getSystemResource("Images/SALogo.png"));
	JLabel image1 = new JLabel(I2);
        image1.setBounds(200,50,100,100);
        add(image1);
        
        JLabel text1 = new JLabel("SA Bank");
        text1.setFont(new Font("Osward",Font.BOLD,20));
        text1.setBounds(210,120,100,100);
        add(text1);
        
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/Logo.png"));
//        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel label = new JLabel(i3);
//        label.setBounds(70, 10, 100, 100);
//        add(label);
//        
//        JLabel text1 = new JLabel("Online");
//        text1.setFont(new Font("Osward",Font.BOLD,20));
//        text1.setBounds(600,100,400,40);
//        add(text1);
     
       

        JLabel text = new JLabel("Login Page");
        text.setFont(new Font("Osward",Font.BOLD,30));
        text.setBounds(170,250,400,40);
        add(text);
        
        JLabel Card_No = new JLabel("Card No : ");
        Card_No.setFont(new Font("Raleway",Font.BOLD,25));
        Card_No.setBounds(80,340,150,30);
        add(Card_No);
        
        t1 = new JTextField();
        t1.setBounds(200, 340, 230, 30);
        t1.setFont(new Font("Arial",Font.BOLD,14));

        add(t1);
        
        JLabel Pin = new JLabel("PIN");
        Pin.setFont(new Font("Raleway",Font.BOLD,25));
        Pin.setBounds(80,400,250,30);
        add(Pin);
        
        t2 = new JPasswordField();
        t2.setBounds(200, 400, 230, 30);
        t2.setFont(new Font("Arial",Font.BOLD,14));
        add(t2);
        
        Login = new JButton("Sign In");
        Login.setBounds(120, 460, 100, 30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        
        Clear = new JButton("Clear");
        Clear.setBounds(250, 460, 100, 30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
        Clear.addActionListener(this);
        add(Clear);
        
        Sign_up = new JButton("Sign Up");
        Sign_up.setBounds(120, 500, 230, 30);
        Sign_up.setBackground(Color.BLACK);
        Sign_up.setForeground(Color.WHITE);
        Sign_up.addActionListener(this);
        add(Sign_up);
        
        
        
        
        
           
        
        
        getContentPane().setBackground(new Color(153, 211, 231));
        
        
        setSize(1100, 700);
        setVisible(true);
        setLocation(250, 70);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Clear){
            
            t1.setText("");
            t2.setText("");
            
        }
        else if(e.getSource()==Login){
            Conn conn = new Conn();
            String cardnumber = t1.getText();
            String PinNumber = t2.getText();
            
            String query = "select * from login where cardnum = '"+cardnumber+"' and pinNum = '"+PinNumber+"'";
            try {
                ResultSet re = conn.s.executeQuery(query);
                if(re.next()){
                    setVisible(false);
                    new Transaction(PinNumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card No or PIN");
                }
            } catch (Exception e1) {
                System.out.println(e1);
            }
            
        }
        else if(e.getSource()==Sign_up){
            setVisible(false);
            new Sign_Up1().setVisible(true);
        }
        

    }
    
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
