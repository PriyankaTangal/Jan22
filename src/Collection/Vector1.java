package Collection;

import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add(100);
		v.add("hundred");
		v.add(500);
		v.add("five hundred");
		System.out.println(v);
		ListIterator listrev=v.listIterator(v.size());
			while(listrev.hasPrevious())
			{
				System.out.print(listrev.previous()+" ");
			}
	}

}
