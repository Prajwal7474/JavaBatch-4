package Teacher;

public class HourlyBased extends Teacher {
	long rate_per_hr;
	 int hrs;
	 
	 void salary()
	 {
		 System.out.println(rate_per_hr*hrs);
	 }
	 
	 
		public HourlyBased(int tid, String tname, long mobileNo, long rate_per_hr, int hrs) {
		super(tid, tname, mobileNo);
		this.rate_per_hr = rate_per_hr;
		this.hrs = hrs;
	}


	}



