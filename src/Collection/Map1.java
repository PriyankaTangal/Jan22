package Collection;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "Priya");
		hm.put(2, "Tangal");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsValue("Priya"));
		System.out.println(hm.containsKey(1));
		System.out.println(hm.get(1));
		

	}

}
