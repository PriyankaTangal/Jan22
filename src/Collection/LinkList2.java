package Collection;

import java.util.LinkedList;

public class LinkList2 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList<>();
		ll.add(50);
		ll.add("Saksham");
		ll.add("60");
		ll.add("Tangal");
		ll.add(null);
		ll.add("Pappa");
		ll.add(null);
		System.out.println(ll);
		for(Object linkli:ll)
		{
			System.out.print(linkli+" ");
		}

	}

}
