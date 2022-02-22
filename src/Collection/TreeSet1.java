package Collection;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
//1.int ts.add(1);
//		ts.add(2);
//		ts.add(3);
//		ts.add(4);
//		System.out.println(ts);
		
//2. Float 
//		ts.add(1.5);
//		ts.add(2.5);
//		ts.add(3.5);
//		ts.add(4.5);
//		System.out.println(ts);
//3. String
		ts.add("Priya");
		ts.add("Pari");
		ts.add("Saksham");
		ts.add("Mahesh");
		System.out.println(ts);
		for(Object list:ts)
		{
			System.out.println(list);
		}
	}
}
