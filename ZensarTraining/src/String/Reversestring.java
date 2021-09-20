package String;

public class Reversestring {
	public static void main(String[] args) {
		String string=  "   Prajwal Mahajan";
		int i;
		//reverse string
		String reversestringstr= " ";
		
		
		for(i=string.length()-1;i>=0;i--) {
			reversestringstr=reversestringstr+string.charAt(i);		
		}
		
		System.out.println("Original String" +string);
		System.out.println("Reverse of given string" +reversestringstr);
			
	}

}
