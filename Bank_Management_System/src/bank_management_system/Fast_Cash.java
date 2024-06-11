/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import com.mysql.cj.protocol.Resultset;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Sanket
 */
public class Fast_Cash extends JFrame implements ActionListener{
    
    JButton Back,Hundread,FiveHundread,Thousand,TwoThousand,FiveThousand,TenThousand;
    String PinNumber;

    public Fast_Cash(String PinNumber) {
        
        this.PinNumber = PinNumber;
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
        
        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(330, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        Hundread = new JButton("Rs 100");
        Hundread.setBounds(220,460,150,30);
        Hundread.addActionListener(this);
        image.add(Hundread);
        
        FiveHundread = new JButton("Rs 500");
        FiveHundread.setBounds(530,460,150,30);
        FiveHundread.addActionListener(this);
        image.add(FiveHundread);
        
        Thousand = new JButton("Rs 1000");
        Thousand.setBounds(220,510,150,30);
        Thousand.addActionListener(this);
        image.add(Thousand);
        
        TwoThousand = new JButton("Rs 2000");
        TwoThousand.setBounds(530,510,150,30);
        TwoThousand.addActionListener(this);
        image.add(TwoThousand);
        
        FiveThousand = new JButton("Rs 5000");
        FiveThousand.setBounds(220,560,150,30);
        FiveThousand.addActionListener(this);
        image.add(FiveThousand);
        
        TenThousand = new JButton("Rs 10000");
        TenThousand.setBounds(530,560,150,30);
        TenThousand.addActionListener(this);
        image.add(TenThousand);
        
        Back = new JButton("Back");
        Back.setBounds(620,650,150,30);
        Back.addActionListener(this);
        image.add(Back);
        
        
        
        
        setSize(900,900);
        setLocation(300, 0);
        
        setUndecorated(true);
        setVisible(true);
                
    
        
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Back){
            setVisible(false);
            new Transaction(PinNumber).setVisible(true);
            
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(3);
            Conn conn =new Conn();
            
            try {
                ResultSet rs = conn.s.executeQuery("Select * from bank where pinNum = '"+PinNumber+"'");
                int balance= 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(e.getSource()!=Back && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Imsufficient balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+PinNumber+"','"+date+"',' Withdrawl','"+amount+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" debited Sucessfully");
                
                setVisible(false);
                new Transaction(PinNumber).setVisible(true);
            } catch (Exception ae) {
                System.out.println(ae);
                        
            }
            
        
        } 
        
        
    }
    
    
    
    public static void main(String[] args) {
        new Fast_Cash("");
    }
    
    
}
