package String;

import java.util.Scanner;

public class upperlower{

		static void changeCase(StringBuffer str) {
			int ln = str.length();

			for (int i = 0; i < ln; i++) {
				Character c = str.charAt(i);
				if (Character.isLowerCase(c))
					str.replace(i, i + 1, Character.toUpperCase(c) + "");
				else
					str.replace(i, i + 1, Character.toLowerCase(c) + "");
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string:- ");
			String str1 = sc.nextLine();
			StringBuffer str = new StringBuffer(str1);
			changeCase(str);
			System.out.println(str);
		}
	
}
