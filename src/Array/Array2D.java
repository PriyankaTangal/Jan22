package Array;

public class Array2D {

	public static void main(String[] args) {
//		int arr[][]=new int[3][3];
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
		
//		int arr[][]=new int[2][2];
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[1][0]=3;
//		arr[1][1]=4;
//		
//		arr[1][0]=4;
//		arr[1][1]=5;
//		arr[1][2]=6;
//		
//		arr[2][0]=7;
//		arr[2][1]=8;
//		arr[2][2]=9;
		
		int arr[][]= {{1,2,3,4},{5,6,7,8,9,10},{11,12,13,14,15}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
