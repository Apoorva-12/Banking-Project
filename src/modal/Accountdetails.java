package modal;

	public class Accountdetails 
	{
		private int Accountnumber,depositamount,debitamount;
		private String transactiontype,Accounttype;
		
		public int  getAccountnumber()
		{
			return Accountnumber;
		}
		
		public int getdepositamount()
		{
			return depositamount;
		}
		
		public int getdebitamount()
		{
		
			return debitamount;
		}

		public String transactiontype()
		{
			return transactiontype;
		}
		public String getAccounttype()
		{
			return Accounttype;
		}
		
		public void setAccountnumber(int Accountnumber)
		{
			this.Accountnumber=Accountnumber;
		}
		
		
		public void setdepositamount(int depositamount)
		{
			this.depositamount=depositamount;
		}
		
		
		public void setdebitamount(int debitamount)
		{
			this.debitamount=debitamount;
		}
		
		public void settransactiontype(String transactiontype)	
		{
			this.transactiontype=transactiontype;
		}
		public void setAccounttype(String Accounttype)
		{
			this.Accounttype=Accounttype;
		}
		
		
		
		
	}



