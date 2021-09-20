package Zensarperson;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CalculateTwoNumberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(22);
		al.add(11);
		al.add(15);
		Iterator Itr = (Iterator) al.iterator();
		int twoDigitCount = 0;
		Iterator itr ;
		while(Itr.next()) {
			Integer num = (Integer) Itr.next(System.in);
			System.out.println(num);
			int count = 0;
			while (num != 0) {
				num /= 10;
				++count;
			}
			if (count == 2) {
				twoDigitCount += 1;
			}

		}
		System.out.println("Two digit count= " + twoDigitCount);

	}


}
