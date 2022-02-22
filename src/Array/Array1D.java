package Array;

import java.util.Arrays;

public class Array1D {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=70;
		a[2]=30;
		a[3]=90;
		a[4]=50;
		
		int b[]= {1,2,3,4,5};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		//for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
//		System.out.println(a[4]-a[0]+" ");
//		System.out.println(a[0]*a[1]);
//		System.out.println(a[4]/a[0]);
//		System.out.println(a[0]+b[0]);
		
		

	}

}
