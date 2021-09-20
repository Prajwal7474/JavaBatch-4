package collection;
import java.util.HashMap;


public class Demomap
{
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Prajwal",11);
		hm.put("OM",12);
		hm.put("Raj",13);
		hm.put("sid",14);
		hm.put(null, 15);
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.remove("Raj"));
		System.out.println(hm);
		System.out.println(hm.containsKey("Harsh"));
		System.out.println(hm.containsValue(17));
		System.out.println(hm.get("Deepa"));

	}

}
