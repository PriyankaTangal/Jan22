package Collection;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm=new HashMap<>();
		hm.put(1, "Priya");
		hm.put(2, "Mahesh");
		hm.put(3, "Pari");
		hm.put(4,"rushna");
		System.out.println(hm);
		System.out.println(hm.containsValue(2));	
		hm.put(2, "Priay");
		System.out.println(hm);

	}

}
