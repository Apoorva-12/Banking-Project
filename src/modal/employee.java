package modal;

public class employee 
{
	private int eid,branchid;
	private String employeename,password,designation;
	
	public int geteid()
	{
		return eid;
	}

	public int branchid()
	{
		return branchid;
	}

	public String employeename()
	{
		return employeename;
	}
	
	public String designation()
	{
		return designation;
	}
	
	public void seteid(int eid)
	{
		this.eid=eid;
	}
	public void setbranchid(int branchid)
	{
		this.branchid=branchid;
	}

	public void setemployeename(String employeename)
	{
		this.employeename=employeename;
	}
	
	public void setdesignation(String sdesignation)
	{
		this.designation=designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

	
	
	
