import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of elements in the array : ");
		size=sc.nextInt();
		System.out.println("Enter the elements : ");
		int A[] = new int[size];
		for (int i = 0 ; i < size ; i++ ) {
			A[i]=sc.nextInt();
		}
		System.out.println("The entered elements are : ");
		for (int i = 0 ; i < size ; i++ ) {
			System.out.print(A[i]+"\t"); 
		}
	}
}