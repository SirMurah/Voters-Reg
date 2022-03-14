/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
import java.sql.*;
import javax.swing.*;
public class db {
   
    public static void main(String[] args) {
        Connection conn=null;
        try{
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VotersDB","root","");
            JOptionPane.showMessageDialog(null, "Connection to database is successful");
           
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    static Connection java_db() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
