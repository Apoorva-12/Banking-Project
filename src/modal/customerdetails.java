package modal;

public class customerdetails 
{
	private   int customerid,age;
	private String name,gender,dob;
	private String email;
	private String phone;
	private String pass;
	private String aadhar,aadharno;
	
	
	public String getPass() 
	{
		return pass;
	}
	
	public int getint() 
	{
		return customerid;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public customerdetails(String name, String email, String phone, String pass, String gender,String aadhar,String aadharno,int customerid,int age,String dob) 
	{
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.pass=pass;
		this.gender=gender;
		this.age=age;
		this.aadharno=aadharno;
		this.aadhar=aadhar;
		this.customerid=customerid;
		this.dob=dob;
	}
	

	

	public customerdetails() {
		// TODO Auto-generated constructor stub
	}

	public String getname()
	{
		return name;
	}
	public String getpass()
	{
		return pass;
	}
	
	public String getgender()
	{
		return gender;
	}
	
	
	
	
	public String getemail()
	{
		return email;
	}
	
	public int getcustomerid()
	{
		return customerid;
	}

	public String getphone()
	{
		return phone;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setgender(String gender)
	{
		this.gender=gender;
	}
	
	public void setemailid(String emailid)
	{
		this.email=email;
	}
	public void setcustomerid(int customerid)
	{
		this.customerid=customerid;
	}

	public void setphone(String phone)
	{
		this.phone=phone;
		}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public String getaadhar() {
		return aadhar;
	}

	public void setaadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getaadharno() {
		return aadharno;
	}

	public void setaadharno(String aadharno) {
		this.aadharno= aadharno;
	}

	

	}
	


	
