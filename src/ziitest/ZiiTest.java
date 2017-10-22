/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ziitest;
import java.sql.*;

/**
 *
 * @author root
 */
public class ZiiTest {

    
    public static final String USERNAME ="zii";
    public static final String PASSWORD ="zii";
    public static final String CONN_URL ="jdbc:mariadb://localhost:3306/ziidb";
   
    
    public static void main(String[] args) {
        
        Connection conn =null;
        
        try {
            
            conn = DriverManager.getConnection(CONN_URL,USERNAME,PASSWORD);
            System.out.println("sayee");
           Statement stmt = conn.createStatement();
           String req="insert into ziidb.ziitable values(22)";
           stmt.executeUpdate(req);
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
       
       
            
            
        }
    
    
}