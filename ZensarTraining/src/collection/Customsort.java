package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class Customsort {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		System.out.println(al.isEmpty());
		
		al.add(new Student(10,"Rahul",70));
		al.add(new Student(13,"Rohan",75));
		al.add(new Student(12,"Prajwal",60));
		al.add(new Student(9,"Ujwal",80));
		
		System.out.println(al.isEmpty());
		
		System.out.println("Before Sort");
		for(int i=0;i<=3;i++)
		{
			System.out.println(al.get(i).studentID);
		}
		
		Collections.sort(al,new ComparebyID());
		
		System.out.println("After Sort");
		for(int i=0;i<=3;i++)
		{
			System.out.println(al.get(i).studentID);
		}
	}
}

