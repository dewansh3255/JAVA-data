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
			{10,11,12,13,14,15},
			{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
		};
		System.out.println("The elements are..........");
		for (int i=0;i<A.length;i++) {
			for (int j=0;j<A[i].length;j++) {
				System.out.print(A[i][j]+" ");
			}	
			System.out.println();
		}
	}
}