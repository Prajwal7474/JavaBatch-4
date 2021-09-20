package loops;

import java.util.Scanner;

public class EvenOdd {


public static void main(String[] args) { 
	
	Scanner a = new Scanner(System.in);
	System.out.println("enter the number");
	int number = a.nextInt();
	
	
	if(number%2==0)
	{
		System.out.println("this is even  number");
	}
	else {
		System.out.println("this is odd number");
	}
	
	
}
}
