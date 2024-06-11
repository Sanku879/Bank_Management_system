/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sanket
 */
public class Sign_Up1 extends JFrame implements ActionListener{

    JButton Clear;
    long random;
    JTextField  Namet,FNamet,Email_addresst,Addresst,Cityt,Statet,Pint;
    JButton next;
    JRadioButton male , Female,Other,Married,Unmarried;
    JDateChooser date;
    public Sign_Up1() {
        
        setLayout(null);
        
        
        ImageIcon I2 = new ImageIcon(ClassLoader.getSystemResource("Images/SALogo.png"));
	JLabel image1 = new JLabel(I2);
        image1.setBounds(700,20,100,100);
        add(image1);
        
        JLabel text1 = new JLabel("SA Bank");
        text1.setFont(new Font("Osward",Font.BOLD,20));
       text1.setBounds(710,80,100,100);
       add(text1);

        
        
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L )+1000L;
        JLabel formno = new JLabel("Application Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        JLabel PersonalDetail = new JLabel("Page 1: Personal Details");
        PersonalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetail.setBounds(290, 80, 400, 30);
        add(PersonalDetail);
        
        
        
        JLabel Name = new JLabel("Name: ");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100, 160, 100, 30);
        add(Name);
        
        Namet = new JTextField();
        Namet.setFont(new Font("Raleway",Font.BOLD,14));
        Namet.setBounds(300, 160, 400, 30);
        add(Namet);
        
        JLabel Fname = new JLabel("Father Name: ");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100, 210, 200, 30);
        add(Fname);
        
        FNamet = new JTextField();
        FNamet.setFont(new Font("Raleway",Font.BOLD,14));
        FNamet.setBounds(300, 210, 400, 30);
        add(FNamet);
        
        JLabel DOB = new JLabel("Date of Birth: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100, 260, 200, 30);
        add(DOB);
        
        date = new JDateChooser();
        date.setBounds(300, 260, 400, 30);
        date.setForeground(Color.BLACK);
        add(date);
        
        JLabel Gender = new JLabel("Gender: ");
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100, 310, 100, 30);
        add(Gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 310, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        
        Female = new JRadioButton("Female");
        Female.setBounds(450, 310, 120, 30);
        Female.setBackground(Color.WHITE);
        add(Female);
        
        Other = new JRadioButton("Other");
        Other.setBounds(600, 310, 180, 30);
        Other.setBackground(Color.WHITE);
        add(Other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(Female);
        gendergroup.add(Other);

        
        JLabel Email_address = new JLabel("Email Address: ");
        Email_address.setFont(new Font("Raleway",Font.BOLD,20));
        Email_address.setBounds(100, 360, 200, 30);
        add(Email_address);
        
        Email_addresst = new JTextField();
        Email_addresst.setFont(new Font("Raleway",Font.BOLD,14));
        Email_addresst.setBounds(300, 360, 400, 30);
        add(Email_addresst);
        
        JLabel Marital = new JLabel("Marital Status: ");
        Marital.setFont(new Font("Raleway",Font.BOLD,20));
        Marital.setBounds(100, 410, 200, 30);
        add(Marital);
        
        Married = new JRadioButton("Married");
        Married.setBounds(300, 410, 100, 30);
        Married.setBackground(Color.WHITE);
        add(Married);
        
        
        Unmarried = new JRadioButton("Un-Married");
        Unmarried.setBounds(450, 410, 100, 30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);
        
        ButtonGroup Maritalgroup = new ButtonGroup();
        gendergroup.add(Married);
        gendergroup.add(Unmarried);
        
        
        JLabel Address = new JLabel("Address: ");
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(100, 460, 200, 30);
        add(Address);
        
        Addresst = new JTextField();
        Addresst.setFont(new Font("Raleway",Font.BOLD,14));
        Addresst.setBounds(300, 460, 400, 30);
        add(Addresst);
        
        
        JLabel City = new JLabel("City: ");
        City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(100, 510, 200, 30);
        add(City);
        
        Cityt = new JTextField();
        Cityt.setFont(new Font("Raleway",Font.BOLD,14));
        Cityt.setBounds(300, 510, 400, 30);
        add(Cityt);
        
        JLabel State = new JLabel("State: ");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100, 560, 200, 30);
        add(State);
        
        Statet = new JTextField();
        Statet.setFont(new Font("Raleway",Font.BOLD,14));
        Statet.setBounds(300, 560, 400, 30);
        add(Statet);
        
        JLabel Pin = new JLabel("Pin Code: ");
        Pin.setFont(new Font("Raleway",Font.BOLD,20));
        Pin.setBounds(100, 610, 200, 30);
        add(Pin);
        
        Pint = new JTextField();
        Pint.setFont(new Font("Raleway",Font.BOLD,14));
        Pint.setBounds(300, 610, 400, 30);
        add(Pint);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 680, 80, 30);
        next.addActionListener(this);
        add(next);
        
        Clear = new JButton("Clear");
        Clear.setBounds(500, 680, 80, 30);
        Clear.setBackground(Color.BLACK);
        Clear.setForeground(Color.WHITE);
//        Clear.addActionListener(this);
        add(Clear);
        
        
        
        
       
        
            
        getContentPane().setBackground(new Color(153, 211, 231));
        
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = ""+random;
        String name = Namet.getText();
        String fname = FNamet.getText();
        String DOB = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(Female.isSelected()){
            gender = "Female";
        }else if(Other.isSelected()){
            gender = "Other";
        }
        String email = Email_addresst.getText();
        String marital = null;
        if(Married.isSelected()){
            marital = "Married";
        }else if(Unmarried.isSelected()){
            marital="Unmarried";
        }
        
        
        String address = Addresst.getText();
        String city = Cityt.getText();
        String State = Statet.getText();
        String Pin = Pint.getText();
        
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Your name");
            }else{
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+DOB+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+State+"','"+Pin+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Sign_up2(formno).setVisible(true);
            }
            
            
        } catch (Exception e1) {
            System.out.println(e1);
        }

    }
    
    
    
    public static void main(String[] args) {
        new Sign_Up1();
    }
    
}
