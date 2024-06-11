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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sanket
 */
public class Pin_Change extends JFrame implements ActionListener{

    JPasswordField repin,pin;
    JButton Back,change;
    
    String Pinnumber;
    public Pin_Change(String pinnumber) {
        this.Pinnumber=pinnumber;
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
        
        JLabel Amount = new JLabel("Change Your PIN");
        Amount.setBounds(380, 300, 700, 35);
        Amount.setForeground(Color.WHITE);
        Amount.setFont(new Font("System",Font.BOLD,16));
        image.add(Amount);
        
        JLabel Pintext = new JLabel("New PIN");
        Pintext.setBounds(230, 350, 700, 35);
        Pintext.setForeground(Color.WHITE);
        Pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(Pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("System",Font.BOLD,25));
        pin.setBounds(450, 350, 200, 35);
        image.add(pin);

        
        JLabel Repin = new JLabel("Re-Enter New PIN");
        Repin.setBounds(230, 400, 700, 35);
        Repin.setForeground(Color.WHITE);
        Repin.setFont(new Font("System",Font.BOLD,16));
        image.add(Repin);
        
        repin = new JPasswordField();
        repin.setFont(new Font("System",Font.BOLD,25));
        repin.setBounds(450, 400, 200, 35);
        image.add(repin);
        
        change = new JButton("Change PIN");
        change.setBounds(220,560,150,30);
        change.addActionListener(this);
        image.add(change);   
        
        Back = new JButton("Back");
        Back.setBounds(530,560,150,30);
        Back.addActionListener(this);
        image.add(Back);        
        
        
        
        setSize(900,900);
        setLocation(300, 0);
        
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==change){
           try {
           String Newpin = pin.getText();
           String Repin = repin.getText();
           
           if(!Newpin.equals(Repin)){
               JOptionPane.showMessageDialog(null,"Pin Does not match");
               return;
           } 
           
               if (Newpin.equals("")) {
                   JOptionPane.showMessageDialog(null, "Please enter New PIN");
                   return;
               }
               if (Repin.equals("")) {
                   JOptionPane.showMessageDialog(null, "Please Re-enter New PIN");
                   return;
               }
               
               Conn conn = new Conn();
               String query1 = "update bank set pinNum = '"+Repin+"' where pinNum = '"+Pinnumber+"'";
               String query2 = "update login  set pinNum = '"+Repin+"' where pinNum = '"+Pinnumber+"'";
               String query3 = "update Signupthree set pinNum = '"+Repin+"' where pinNum = '"+Pinnumber+"'";
               
               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
               
               JOptionPane.showMessageDialog(null, "PIN Changes Sucessfully");
               
               setVisible(false);
               new Transaction(Repin).setVisible(true);
           
           
        } catch (Exception ae) {
             System.out.println(ae);
        }
           
          
        }else{
                   setVisible(false);
                   new Transaction(Pinnumber).setVisible(true);
                   }
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        new Pin_Change("").setVisible(true);
    }
}
