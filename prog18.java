import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int [3][3];
		System.out.println("Enter elements :");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++){
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements of the arrays are :");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++){
				System.out.print(A[i][j]+" ");
			}
		System.out.println();
		}
	}
}