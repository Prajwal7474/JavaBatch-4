package String;


	import java.util.Scanner;

	public class Anagram {
		
		public static int anagram(String firstString,String secondString)
		{
			int count=0;
			if(firstString.length()==secondString.length())
			{
				System.out.println(secondString.length());
				
				for(int i=0;i<secondString.length();i++)
				{
					System.out .println(secondString.charAt(i));
					count = secondString.indexOf(secondString.charAt(i));
					System.out.println(count);
					return count;
				}
			}
			else
			{
				System.out.println("out of if");
			}
			
			return count;
		}
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first String");
			String firstString = sc.next();
			System.out.println("Enter second String");
			String secondString = sc.next();
			
			if(anagram(firstString,secondString)>0)
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
		}

	}




