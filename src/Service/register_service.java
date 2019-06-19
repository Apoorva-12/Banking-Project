package Service;
import java.sql.Connection;
import java.sql.PreparedStatement;

import modal.customerdetails;
import util.jdbc;

public class register_service 
{
	static int customer_id=3;
	public boolean insert(customerdetails cd) 
	{
		System.out.println("Insert method");
		Connection con = jdbc.getConnection();
		int status=0;
		boolean flag=false;
		try
		{
			if(con!=null)
			{
				String sql="select * from customer_details (name, gender, contact_number, email_id, pass,customer_id) values(?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				
				
				ps.setString(1, cd.getname());
				ps.setString(2, cd.getgender());
				ps.setString(3, cd.getphone());
				ps.setString(4, cd.getemail());
				ps.setString(5, cd.getpass());
				
				ps.setString(6, Integer.toString(customer_id));
				
				status=ps.executeUpdate();
				if(status==1)
					flag=true;		
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag; 
	}

	

}
