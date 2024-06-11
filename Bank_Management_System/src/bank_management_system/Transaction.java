/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Sanket
 */
public class Transaction extends JFrame implements ActionListener{

    JButton Exit,deposit,Withdraw,Fast_Cash,Mini_Statement,Pin_Change,Balance;
    String PinNumber;
    public Transaction(String PinNumber)  {
        
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
        
        JLabel text = new JLabel("Please Select your Transaction");
        text.setBounds(330, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(220,460,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        Withdraw = new JButton("Cash Withdraw");
        Withdraw.setBounds(530,460,150,30);
        Withdraw.addActionListener(this);
        image.add(Withdraw);
        
        Fast_Cash = new JButton("Fast Cash");
        Fast_Cash.setBounds(220,510,150,30);
        Fast_Cash.addActionListener(this);
        image.add(Fast_Cash);
        
        Mini_Statement = new JButton("Mini Statement");
        Mini_Statement.setBounds(530,510,150,30);
        Mini_Statement.addActionListener(this);
        image.add(Mini_Statement);
        
        Pin_Change = new JButton("PIN Change");
        Pin_Change.setBounds(220,560,150,30);
        Pin_Change.addActionListener(this);
        image.add(Pin_Change);
        
        Balance = new JButton("Balance");
        Balance.setBounds(530,560,150,30);
        Balance.addActionListener(this);
        image.add(Balance);
        
        Exit = new JButton("Exit");
        Exit.setBounds(620,650,150,30);
        Exit.addActionListener(this);
        image.add(Exit);
        
        
        
        
        setSize(900,900);
        setLocation(300, 0);
        
        setUndecorated(true);
        setVisible(true);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Exit){
            System.exit(0);
            
        }else if (e.getSource()==deposit) {
            setVisible(false);
            new Deposit(PinNumber).setVisible(true);
        } else if(e.getSource()==Withdraw){
            setVisible(false);
            new Withdraw(PinNumber).setVisible(true);
        }else if(e.getSource()==Fast_Cash){
            setVisible(false);
            new Fast_Cash(PinNumber).setVisible(true);
        }else if(e.getSource()==Pin_Change){
            setVisible(false);
            new Pin_Change(PinNumber).setVisible(true);
        }else if(e.getSource()==Balance){
            setVisible(false);
            new Balance_enquiry(PinNumber).setVisible(true);
        }else if(e.getSource()==Mini_Statement){
            
            new Mini_Statement(PinNumber).setVisible(true);
        }
    
    }
    
    public static void main(String[] args) {
        new Transaction("");
    }
    
}
