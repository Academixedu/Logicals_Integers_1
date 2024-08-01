import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = scan.nextInt();
    int temp =1;
    for(int i = 1;i<=a;i++)
    {
        temp = temp*i;
        System.out.println("factorial of "+a+" is "+temp);
    }
}
}
