package Service;

import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String name,String pass) 
     {
      boolean st =false;
      try
      {

	
         Class.forName("oracle.jdbc.driver.OracleDriver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:oracle:thin:@localhost:1521:xe\", \"hr\", \"pass");
         PreparedStatement ps =con.prepareStatement
                             ("select name,pass from Employee_details where name=? and pass=?");
         
		ps.setString(1, name);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st; 
     }
 }
     


