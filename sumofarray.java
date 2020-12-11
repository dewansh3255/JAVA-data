import java.util.Scanner;
class Sum
{
	public static void main(String[] args) {
		int A[] = new int[10];
		int s=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter values to be added :\n");
		for (int i=0; i<10 ; i++ ) {
			A[i] = sc.nextInt();
			s += A[i];
		}
		System.out.println("The sum is : " + s);
	}
}