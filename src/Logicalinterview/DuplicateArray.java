package Logicalinterview;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		String s1[]= {"java","python","rubby","java","c","python"};
//		for(int i=0;i<s1.length;i++)
//		{
//			for(int j=i+1;j<s1.length;j++)
//			{
//				if(s1[i].equals(s1[j]))
//				{
//					System.out.println(s1[i]);
//				}
//			}
//		}
//hashset
		
		HashSet<String> store = new HashSet<String>();
		for(String s:s1)
		{
			if(store.add(s)==false)
			{
				System.out.println("duplicate element is:"+s);
			}
		}
		
//hashmap
//		HashMap hs = new HashMap<>();
//		for(hs.get)
//		hs.put("java", 2);
//		hs.put("python", 3);
//		
	}

}
