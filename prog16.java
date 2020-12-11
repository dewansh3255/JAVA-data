import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		int s=0;
		Scanner sc = new Scanner (System.in);
		int A[] = new int[10];
		System.out.println("Enter elements to add : ");
		for (int i = 0 ; i < 10 ; i++ ) {
			A[i]=sc.nextInt();
		}
		for (int i = 0 ; i < 10 ; i++ ) {
			s += A[i];
		}
		System.out.println("Sum of the entered elements is : "+s);
	}
}