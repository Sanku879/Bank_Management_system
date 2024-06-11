/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Sanket
 */
public class Sign_up3 extends JFrame implements ActionListener{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    public Sign_up3(String formno) {
        
        this.formno = formno;
        
        setLayout(null);
        
        ImageIcon I2 = new ImageIcon(ClassLoader.getSystemResource("Images/SALogo.png"));
	JLabel image1 = new JLabel(I2);
        image1.setBounds(700,20,100,100);
        add(image1);
        
        JLabel text1 = new JLabel("SA Bank");
        text1.setFont(new Font("Osward",Font.BOLD,20));
       text1.setBounds(710,80,100,100);
       add(text1);
        
        JLabel AccountDetail = new JLabel("Page 3: Account Details ");
        AccountDetail.setFont(new Font("Raleway",Font.BOLD,22));
        AccountDetail.setBounds(280, 40, 400, 40);
        add(AccountDetail);
        
        JLabel Type = new JLabel("Account Type ");
        Type.setFont(new Font("Raleway",Font.BOLD,22));
        Type.setBounds(100, 140, 200, 30);
        add(Type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(153, 211, 231));
        r1.setBounds(100,180,150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(153, 211, 231));
        r2.setBounds(350,180,250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(153, 211, 231));
        r3.setBounds(100,220,150, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(153, 211, 231));
        r4.setBounds(350,220,250, 20);
        add(r4);
        
        
        ButtonGroup Account = new ButtonGroup();
        Account.add(r1);
        Account.add(r2);
        Account.add(r3);
        Account.add(r4);
        
        JLabel Card = new JLabel("Card Number: ");
        Card.setFont(new Font("Raleway",Font.BOLD,22));
        Card.setBounds(100, 300, 200, 30);
        add(Card);
        
        JLabel Number = new JLabel("XXXX-XXXX-XXXX-4184 ");
        Number.setFont(new Font("Raleway",Font.BOLD,22));
        Number.setBounds(330, 300, 300, 30);
        add(Number);
        
        JLabel Card_detail = new JLabel("Your 16 digit Card Number ");
        Card_detail.setFont(new Font("Raleway",Font.BOLD,12));
        Card_detail.setBounds(100, 330, 300, 20);
        add(Card_detail);
        
        JLabel Pin = new JLabel("PIN: ");
        Pin.setFont(new Font("Raleway",Font.BOLD,22));
        Pin.setBounds(100, 370, 200, 30);
        add(Pin);
        
        JLabel Pin_Number = new JLabel("XXXX ");
        Pin_Number.setFont(new Font("Raleway",Font.BOLD,22));
        Pin_Number.setBounds(330, 370, 300, 30);
        add(Pin_Number);
        
        JLabel Pin_detail = new JLabel("Your 4 digit PIN ");
        Pin_detail.setFont(new Font("Raleway",Font.BOLD,12));
        Pin_detail.setBounds(100, 400, 300, 20);
        add(Pin_detail);
        
        JLabel Services = new JLabel("Services Required: ");
        Services.setFont(new Font("Raleway",Font.BOLD,22));
        Services.setBounds(100, 450, 400, 30);
        add(Services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(153, 211, 231));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(153, 211, 231));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(153, 211, 231));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("Email Alert");
        c4.setBackground(new Color(153, 211, 231));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(153, 211, 231));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(153, 211, 231));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(new Color(153, 211, 231));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(220, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancle = new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Raleway",Font.BOLD,14));
        cancle.setBounds(420, 720, 100, 30);
        cancle.addActionListener(this);
        add(cancle);
        
        

        getContentPane().setBackground(new Color(153, 211, 231));

        
        
        setSize(850, 820);
        setLocation(350, 10);
        setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==submit){
            String account_type = null;
            if(r1.isSelected()){
                account_type="Saving Account";
                
            }
            else if(r2.isSelected()){
                account_type="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                account_type="Current Account";
            }
            else if(r4.isSelected()){
                account_type="Reccuring Deposit Account";
            }
            
            Random random = new Random();
            String cardnum =""+Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L);
            String pinNum = ""+Math.abs((random.nextLong() % 9000L)+1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility+" ATN Card";
            }else if(c2.isSelected()){
                facility = facility+" Internet Banking";
            }else if(c3.isSelected()){
                facility = facility+" Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility+" EMAIL & SMS ALeart";
            }
            else if(c5.isSelected()){
                facility = facility+" Cheque Book";
            }
            else if(c6.isSelected()){
                facility = facility+" E-Statement";
            }
            
                    
            try {
                
                if(account_type.equals("")){
                    JOptionPane.showMessageDialog(null, "Please select Account type");
                }
                else {
                    Conn conn = new Conn();
                    String query1 = "insert into Signupthree values('"+formno+"','"+account_type+"','"+cardnum+"','"+pinNum+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnum+"','"+pinNum+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardnum+" \n Pin: "+pinNum);
                    
                    
                }
                
                setVisible(false);
                new Deposit(pinNum).setVisible(true);
                
            } catch (Exception ae) {
                System.out.println(ae);
            }
            
            
            
        }
        else if(e.getSource()==cancle){
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    
    
    
    
    
    
    
    public static void main(String[] args) {
        new Sign_up3("");
    }
    
}
