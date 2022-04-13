/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author acer
 */
public class DBconnect {
    public static Connection getCon(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "");
           return con;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
