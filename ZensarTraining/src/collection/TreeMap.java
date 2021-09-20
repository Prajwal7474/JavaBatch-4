package collection;
import java.util.TreeMap;

public class TreeMap {
 public static void main(String[] args) {
	 TreeMap<Integer,String> tm=new  TreeMap<>(new mysort());
	 tm.put(1,"A");
	 tm.put(2,"B");
	 tm.put(3,"C");
	 tm.put(4,"D");
	 System.out.println(tm);
 }
}
