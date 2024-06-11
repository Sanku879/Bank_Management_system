/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Sanket
 */
public class Sign_up2 extends JFrame implements ActionListener{
    


    JButton Clear;
    
    JTextField  panNo,aadharNo;
    JButton next;
    JRadioButton seniory,seniorn,Exsn,Exsy;
    JComboBox religion,income,qualifiaction,occupation;
    String formno;
    
    public Sign_up2(String formno) {
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

        
        JLabel AdditionalDetail = new JLabel("Page 2: Additional details ");
        AdditionalDetail.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetail.setBounds(290, 80, 400, 30);
        add(AdditionalDetail);
        
        
        
        JLabel Religion = new JLabel("Religion: ");
        Religion.setFont(new Font("Raleway",Font.BOLD,20));
        Religion.setBounds(100, 160, 100, 30);
        add(Religion);
        
        String val[]={"Hindu","Muslim","Sikh","Christian","other"};
        religion = new JComboBox(val);
        religion.setBounds(300, 160, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
      
        
        JLabel Income = new JLabel("Income: ");
        Income.setFont(new Font("Raleway",Font.BOLD,20));
        Income.setBounds(100, 210, 200, 30);
        add(Income);
        
        String val1[]={"0","Below 1 Lakh","Between 1 Lakh to 2 Lakh","Between 2 Lakh to 5 Lakh","Between 5 Lakh to 10 Lakh","Greater than 10 Lakh"};
        income = new JComboBox(val1);
        income.setBounds(300, 210, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
     
        JLabel Qualifiaction = new JLabel("Qualification: ");
        Qualifiaction.setFont(new Font("Raleway",Font.BOLD,20));
        Qualifiaction.setBounds(100, 260, 200, 30);
        add(Qualifiaction);
        
        String val3[]={"10th","12th","Under Graduate","Post Graduate","PHD","other"};
        qualifiaction = new JComboBox(val3);
        qualifiaction.setBounds(300, 260, 400, 30);
        qualifiaction.setBackground(Color.WHITE);
        add(qualifiaction);
        
       
        
        JLabel Occupation = new JLabel("Occupation: ");
        Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        Occupation.setBounds(100, 310, 200, 30);
        add(Occupation);
        
        String val4[]={"Salaried","Self-Employed","Business","Student","Retried","Ohter"};
        occupation = new JComboBox(val4);
        occupation.setBounds(300, 310, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
        
        JLabel PanNo = new JLabel("Pan No: ");
        PanNo.setFont(new Font("Raleway",Font.BOLD,20));
        PanNo.setBounds(100, 360, 200, 30);
        add(PanNo);
        
        panNo = new JTextField();
        panNo.setFont(new Font("Raleway",Font.BOLD,14));
        panNo.setBounds(300, 360, 400, 30);
        add(panNo);
        
        
        JLabel AadharNo = new JLabel("Aadhar No: ");
        AadharNo.setFont(new Font("Raleway",Font.BOLD,20));
        AadharNo.setBounds(100, 410, 200, 30);
        add(AadharNo);
        
        aadharNo = new JTextField();
        aadharNo.setFont(new Font("Raleway",Font.BOLD,14));
        aadharNo.setBounds(300, 410, 400, 30);
        add(aadharNo);
        
        JLabel Senior = new JLabel("Senior citizen: ");
        Senior.setFont(new Font("Raleway",Font.BOLD,20));
        Senior.setBounds(100, 460, 200, 30);
        add(Senior);
        
        seniory = new JRadioButton("Yes");
        seniory.setBounds(300, 460, 100, 30);
        seniory.setBackground(Color.WHITE);
        add(seniory);
        
        
        seniorn = new JRadioButton("No");
        seniorn.setBounds(450, 460, 100, 30);
        seniorn.setBackground(Color.WHITE);
        add(seniorn);
        
        ButtonGroup SeniorCitizen = new ButtonGroup();
        SeniorCitizen.add(seniory);
        SeniorCitizen.add(seniorn);
        
        
        JLabel Existing_Account = new JLabel("Existing Account: ");
        Existing_Account.setFont(new Font("Raleway",Font.BOLD,20));
        Existing_Account.setBounds(100, 510, 200, 30);
        add(Existing_Account);
        
        Exsy = new JRadioButton("Yes");
        Exsy.setBounds(300, 510, 100, 30);
        Exsy.setBackground(Color.WHITE);
        add(Exsy);
        
        
        Exsn = new JRadioButton("No");
        Exsn.setBounds(450, 510, 100, 30);
        Exsn.setBackground(Color.WHITE);
        add(Exsn);
        
        ButtonGroup Existing = new ButtonGroup();
        Existing.add(Exsy);
        Existing.add(Exsn);
        
        
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
        Clear.addActionListener(this);
        add(Clear);
        
        
        
        
       
        
            
        getContentPane().setBackground(new Color(153, 211, 231));
        
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String formno = ""+random;
        String Religion = (String)religion.getSelectedItem();
        String Income = (String)income.getSelectedItem();
        String Qualification = (String)qualifiaction.getSelectedItem();
        String Occupation = (String)occupation.getSelectedItem();

        
        String PanNo = panNo.getText();
        String AadharNo = aadharNo.getText();
        String Senior_Citizen = null;
        if(seniory.isSelected()){
            Senior_Citizen = "Yes";
        }else if(seniorn.isSelected()){
            Senior_Citizen = "No";
        }
        String Existing_Account = null;
        if(Exsy.isSelected()){
            Existing_Account = "Yes";
        }else if(Exsn.isSelected()){
            Existing_Account="No";
        }
        
        
        ;
        
        try {
            if(Religion.equals("")){
                JOptionPane.showMessageDialog(null, "Please Select your Relision");
            }else{
                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formno+"','"+Religion+"','"+Income+"','"+Qualification+"','"+Occupation+"','"+PanNo+"','"+AadharNo+"','"+Senior_Citizen+"','"+Existing_Account+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Sign_up3(formno).setVisible(true);
            }
            
            
        } catch (Exception e1) {
            System.out.println(e1);
        }

    }
    
    
    
    public static void main(String[] args) {
        new Sign_up2("");
    }
    
}


