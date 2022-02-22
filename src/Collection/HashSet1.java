package Collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add("Priya");
		hs.add("Tangal");
		hs.add(null);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		hs.add("Priya");
		hs.add("Tangal");
		System.out.println(hs);

	}

}
