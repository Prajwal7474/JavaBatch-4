package Containment;

 class Association {
	
	
	
	public static void main(String[] args) 
	
	
	{
		
		Bank bank=new Bank("Axis");
		Employee emp=new Employee("Prajwal");
		
		System.out.println(emp.getEmployeeName()+ " is employee of " +bank.getBankname());
		
	
	}
	

}
