package zensar_program;

public class EmployeeDetails {
	int emp_id,salary;
	String name,department,address;
	
	
	//getter and setter properties
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee[emp_id="+emp_id+",salary="+salary+",name="+name+",department="+department+",address="+address+"]";
	
	}
	
		
		

	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmp_id(10);
		emp.setSalary(20000);
		emp.setName("Prajwal");
		emp.setDepartment("Computer");
		emp.setAddress("At Post Mothe Waghoda, Tal-Raver, Dist-Jalgaon");
		//showing details of employee
		System.out.println("emp");
		
	}
	
	
	

	}
	



