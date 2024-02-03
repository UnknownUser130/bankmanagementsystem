/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;

/**
 *
 * @author admin
 */
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","1234Akash");
            s = c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
