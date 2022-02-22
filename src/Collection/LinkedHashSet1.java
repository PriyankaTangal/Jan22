package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(null);
		lhs.add("priya");
		lhs.add("Priya");
		lhs.add(null);
		lhs.add("Ramesh");
		System.out.println(lhs);
		lhs.add("Priya");
		System.out.println(lhs);

	}

}
