import java.util.Scanner;
class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String fullname;
        System.out.println("Enter your fullname : ");
        fullname = sc.nextLine();
        System.out.println("The full name is : "+fullname);
    }
}