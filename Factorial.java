import java.util.Scanner;

public class Factorial
{
// Write Your Code Here
public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.print("Enter Your Number =  ");
    int a=in.nextInt();
    int temp=1;
    for(int i=1;i<=a;i++)
    {
        temp=temp*i;
    }
    System.out.println("Factorial = "+temp);
}
}
