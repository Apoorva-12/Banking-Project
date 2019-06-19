package Service;
import java.sql.Connection;
import java.sql.PreparedStatement;

import modal.customerdetails;
import util.jdbc;

public class openaccount_service 
{
	static int customer_id=1;
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
				String sql="insert into customer_details (name, gender, contact_number, email_id,customer_id,aadhar,aadharno,age,dob) values(?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				
				
		        ps.setString(1, cd.getname());
				ps.setString(2, cd.getgender());
				ps.setString(3, cd.getphone());
				ps.setString(4, cd.getemail());
				ps.setString(6, cd.getaadhar());
				ps.setString(7, cd.getaadharno());
				   ps.setInt(8, cd.getage());
				ps.setString(9, cd.getdob());
				
			
				
				ps.setString(10, Integer.toString(customer_id));
				
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
	
