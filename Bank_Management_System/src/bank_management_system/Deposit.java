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
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sanket
 */
public class Deposit extends JFrame implements ActionListener{

    JTextField amount;
    JButton deposit,Back;
    String PinNum;
    public Deposit(String PinNum) {
        this.PinNum = PinNum;
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
        
        JLabel Amount = new JLabel("Enter the Amount you want to deposit");
        Amount.setBounds(320, 300, 700, 35);
        Amount.setForeground(Color.WHITE);
        Amount.setFont(new Font("System",Font.BOLD,16));
        image.add(Amount);
        
        amount = new JTextField();
        amount.setFont(new Font("System",Font.BOLD,22));
        amount.setBounds(310, 350, 320, 25);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(530,510,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
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
        
        if(e.getSource()==deposit){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to deposite");
            }
            else{
                try {
                Conn conn = new Conn();
                String query = "insert into bank values('"+PinNum+"','"+date+"','Deposit','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited Sucessfully");
                    setVisible(false);
                    new Transaction(PinNum).setVisible(true);
                } catch (Exception ae) {
                    System.out.println(ae);
                }
               
            }
        }else if (e.getSource()==Back) {
            setVisible(false);
            new Transaction(PinNum).setVisible(true);
        }
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Deposit("");
    }
    
}
