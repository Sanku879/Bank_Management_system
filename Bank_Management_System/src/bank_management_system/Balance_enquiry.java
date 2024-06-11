/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;

/**
 *
 * @author Sanket
 */
public class Balance_enquiry extends JFrame implements ActionListener{

    JButton Back;
    String PinNumber;
    public Balance_enquiry(String PinNumber) {
        this.PinNumber=PinNumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        ImageIcon I2 = new ImageIcon(ClassLoader.getSystemResource("Images/SALogo.png"));
	JLabel image1 = new JLabel(I2);
        image1.setBounds(390,100,100,100);
        image.add(image1);
        
        JLabel text1 = new JLabel("SA Bank");
        text1.setFont(new Font("Osward",Font.BOLD,20));
        text1.setBounds(400,170,100,100);
        image.add(text1);
        
        Back = new JButton("Back");
        Back.setBounds(530,560,150,30);
        Back.addActionListener(this);
        image.add(Back);    
        
        Conn conn =new Conn();
        int balance= 0;
        try {
             ResultSet rs = conn.s.executeQuery("Select * from bank where pinNum = '"+PinNumber+"'");
                
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
        } catch (Exception e) {
            System.out.println(e);
                  
        }
        
        JLabel text = new JLabel("Your Current Account balance is Rs: "+ balance );
        text.setForeground(Color.WHITE);
        text.setBounds(250, 300, 400, 30);
        text.setFont(new Font("Osward",Font.BOLD,20));
        image.add(text);
        
        
        setSize(900,900);
        setLocation(300, 0);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transaction(PinNumber).setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
        new Balance_enquiry("");
    }
    
}
