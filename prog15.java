import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int A[] = new int[10];
		System.out.println("Enter 10 elements : ");
		for (int i = 0 ; i < 10 ; i++ ) {
			A[i]=sc.nextInt();
		}
		System.out.println("The elements entered by you are : ");
		for (int i = 0 ; i < 10 ; i++ ) {
			System.out.print(A[i]	+"\t");
		}
	}
}