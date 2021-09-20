package String;
import java.util.Scanner;
public class FirstOccurence {
	/*private static final String FirstOccurencestr=null;*/
	private static Scanner sc;
	public static void main(String[] args) {
		String FirstOccurencestr;
		int i,flag=0;
		char ch;
		
		sc=new Scanner(System.in);
		System.out.println("\nenter streing to find first occurence");
		FirstOccurencestr=sc.nextLine();
		
		
		System.out.println("\n entet the character to find");
		ch=sc.next().charAt(0);
		
		
		for(i=0;i<FirstOccurencestr.length();i++)
		{
			if(FirstOccurencestr.charAt(i)==ch) {
				flag++;
				break;
				
			}
		
	}
	
		if(flag==0) {
			System.out.println("\n do not found character");
			
		}
		else {
			System.out.print(ch);
		}
}
}