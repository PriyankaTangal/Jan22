package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add("Priya");
	al.add(1);
	al.add("Priya");
	al.add(2);
	al.add("Pari");
	al.add(null);
	System.out.println(al);
	al.remove(1);
	al.add(null);
	System.out.println(al);
	
	System.out.println(al.size());
	System.out.println(al.clone());
	System.out.println(al.contains("priya")); //false
	System.out.println(al.contains("Priya")); //true
	System.out.println(al.contains(null));  //true
	System.out.println(al.equals(al.clone())); //true
	System.out.println(al.get(0));
	System.out.println(al.get(4));
	System.out.println(al.isEmpty());
	System.out.println(al);
	System.out.println(al.lastIndexOf(null));
	al.add("Priya");
	System.out.println(al.lastIndexOf("Priya"));
	al.remove(6);
	System.out.println(al);
	int a=10;
	System.out.println(a+(int)al.get(2));
	System.out.println(al);
	
	System.out.println("al print using for loop");
	for(int i=0;i<al.size();i++)
	{
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	System.out.println("al print using for each loop");
	for(Object list:al)
	{
		System.out.print(list+" ");
	}
	System.out.println();
	System.out.println("al print using Iterator");
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+" ");
	}
	System.out.println();
	System.out.println("al print using ListIterator");
	ListIterator listrev=al.listIterator(al.size());
	while(listrev.hasPrevious())
	{
		System.out.print(listrev.previous()+" ");
	}
}
}
