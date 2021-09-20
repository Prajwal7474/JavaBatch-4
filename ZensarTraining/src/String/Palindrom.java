	package String;
import java.util.Scanner;
public class Palindrom {
	public String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	} 

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String newString = sc.next();
		Palindrom palindrom =new Palindrom();
		String reverseString = palindrom.reverseString(newString);
		
		if(newString.equals(reverseString))
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
	}
}



