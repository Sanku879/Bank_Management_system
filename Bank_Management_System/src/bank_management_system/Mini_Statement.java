/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;

/**
 *
 * @author Sanket
 */
public class Mini_Statement extends JFrame{

    JLabel mini;
    public Mini_Statement(String PinNumber) {
        
        setLayout(null);
        
        JLabel l1 = new JLabel();
        add(l1);
        
        JLabel l2 = new JLabel("SA Bank");
        l2.setBounds(150, 20, 100, 20);
        add(l2);
        
        JLabel Card = new JLabel();
        Card.setBounds(20, 80, 300, 20);
        add(Card);
        
        mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);
        
        JLabel balance = new JLabel();
        balance.setBounds(20, 400, 300, 20);
        add(balance);
        try {
            
            Conn con = new Conn();
            ResultSet rs = con.s.executeQuery("select * from login where pinNum = '"+PinNumber+"'");
            while(rs.next()){
                Card.setText("Card Number : "+rs.getString("cardnum").substring(0,4)+ "XXXXXXXX"+ rs.getString("cardnum").substring(12));
                
                
            }
                    
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            
            Conn conn = new Conn();
            int balance1 = 0;
            
            ResultSet rs1 = conn.s.executeQuery("select * from bank where pinNum = '"+PinNumber+"'");
            while(rs1.next()){
                mini.setText(mini.getText() + "<html>"  +rs1.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ rs1.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs1.getString("amount") + "<br><br><html>");
                  if(rs1.getString("type").equals("Deposit")){
                        balance1+=Integer.parseInt(rs1.getString("amount"));
                    }else{
                        balance1-=Integer.parseInt(rs1.getString("amount"));
                    }
                
            }
            
            balance.setText("Your Current Account balance is Rs: "+balance1);
            
        } catch (Exception ae) {
            System.out.println(ae);
        }
        
        
        
        
        
        
        
        setSize(400,600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
    }
    
    
    
    public static void main(String[] args) {
        new Mini_Statement("");
    }
    
}
