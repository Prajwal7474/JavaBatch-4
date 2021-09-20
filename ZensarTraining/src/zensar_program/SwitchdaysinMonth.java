package zensar_program;
import java.util.Scanner;

public class SwitchdaysinMonth{
	public static void main(String[] args)
	{
	int month;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter month number from 1 to 12");
	month = s. nextInt();
	
	
	
	switch(month) {
	
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: System.out.println("/n 31 days are there in this month");
	 break;
	   
	 
	case 2: System.out.println("/n28 or 29 days are there in this month");
	break;
	
	
	case 4:
	case 6:
	case 9:
	case 11: System.out.println("/n30 days are there in this month");
	break;
	}

  } 
}
