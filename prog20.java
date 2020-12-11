import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A[][]=
		{
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{56,7,34,3},
			{1000,2,3,4,5,6,47,7,8,9,10,11,12,13,147}
		};
		int largest[] = new int[A.length];
		for (int i = 0 ; i<A.length ; i++ ) 
		{
			largest[i] = A[i][0];
			for (int j=0;j<A[i].length ;j++ ) 
			{
				if (A[i][j]>largest[i]) 
				{
					largest[i] = A[i][j];	
				}
			}
		}
		for (int i = 0 ; i<A.length ; i++ )
		{
			System.out.println("The largest element in row "+(i+1)+" : "+largest[i]+" ");
		} 
	}

}