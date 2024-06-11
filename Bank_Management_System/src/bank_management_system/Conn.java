/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bank_management_system;

import java.sql.*;
/**
 *
 * @author Sanket
 */
public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
//            class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","java@123456");
            s=c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
                    
        }
    }
    
    
}
