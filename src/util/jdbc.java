package util;

	import java.sql.DriverManager;
	import java.sql.Connection;
	import java.sql.SQLException;
	

	public class jdbc {
		static Connection con =null;
	    public static Connection getConnection() {

	        System.out.println("-------- Oracle JDBC Connection Testing ------");

	        try {

	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            System.out.println("Oracle JDBC Driver Registered!");

	            con = DriverManager.getConnection(
	                    "jdbc:oracle:thin:@localhost:1521:xe", "hr", "pass");

	        } catch (SQLException  | ClassNotFoundException e ) 
	        {

	            System.out.println("Connection Failed! Check output console");
	            e.printStackTrace();
	        }
			return con;
	    }

	}


