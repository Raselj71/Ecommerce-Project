
package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.logging.Level;
import java.util.logging.Logger;


public class dbcon {
       public static final  String URL="jdbc:mysql://104.247.108.18:3306/techtuto_ecommerceDB";
       public static final String DBUSERNAME="techtuto_ecommerceUSER";
       public static final String DBPASSWORD="p1SGkgB4aU";
      public Connection c;
      public Statement s;
       
       public dbcon(){
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               c=DriverManager.getConnection(URL, DBUSERNAME, DBPASSWORD);
               s=c.createStatement();
              
           } catch (SQLException ex) {
               Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       
       
      
   
    }

    
    

        
      
   

