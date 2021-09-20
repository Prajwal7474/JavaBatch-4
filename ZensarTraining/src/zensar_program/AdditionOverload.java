package zensar_program;

public class AdditionOverload {
	 public void addition() {
		 System.out.println("addition");
		 System.out.println(10+20);
	 }
	 
	 public int addition(int numberOne,int numberTwo) {
		
		 return (numberOne+numberTwo);
	 }
	 public void addition(float numberOne, float numberTwo) 
	 {
		 System.out.println(numberOne+numberTwo);
	 }
	 public void addition(int numberOne, float numberTwo, int numberThree) 
	 {
		 System.out.println(numberOne+numberTwo+numberThree);
	 }
	 public int sub() 
	 {
		 return 20-80;
	 }
	 
	
	public static void main(String[] args) {
		AdditionOverload additionOverload=new AdditionOverload();
		additionOverload.addition();
		int sum=additionOverload.addition(50, 400);// call
		System.out.println(sum);
		System.out.println(additionOverload.addition(40, 400));// call
		additionOverload.addition(200, 55.50f,60);
		additionOverload.addition(30.4f, 5.4f);
		System.out.println(additionOverload.sub());
	}

}
