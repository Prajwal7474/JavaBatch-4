package Teacher;

public class SalaryTeacher extends Teacher {
		
		int salary;
		
		
		public SalaryTeacher(int tid, String tname, long mobileNo, int salary) {
			super(tid, tname, mobileNo);
			this.salary = salary;
		}



		@Override
		void salary() {
			System.out.println("Salary:" +salary);
			
		

	}
		

}
		
		
		

