package String;
import java.util.*;

public class PalindromusingArray {
	
	
	public String reverseString(String newString)
	{
		char ch[] = newString.toCharArray();		//Create array of character from given string
		String finalString = "";					//create empty String
		
		for(int i=ch.length-1;i>=0;i--)
		{
		finalString = finalString+ch[i];			//Concatenate String with last char of array in each iteration ;
		}
		return finalString;						//return reverseString
				
	}
	public static void main(String[] args) {

			PalindromusingArray p = new PalindromusingArray();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter String:");
			String newString = sc.next();
			
			String reverse = p.reverseString(newString);
			System.out.println(reverse);
			
			if(reverse.equals(newString))
			{
				System.out.println("Palindrom");
			}
			else
			{
				System.out.println("Not palindrom");
			}

		
	}
}