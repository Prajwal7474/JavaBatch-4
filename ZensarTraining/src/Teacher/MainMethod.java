package Teacher;

public class MainMethod {

		public static void main(String[] args) {
			Teacher salaryBased = new SalaryTeacher(20,"Deepa",12345,3000);
			salaryBased.showInfo();
			salaryBased.salary();

			Teacher hourlyBased = new HourlyBased(22,"Balaji",88883,2000,3);  //HourlyBased object
			hourlyBased.showInfo();
			hourlyBased.salary();
		}

	}

