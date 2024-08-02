import java.util.Scanner;

public class Fibonacci{
// Write your code here
public void fib()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("enter first number");
    int a = scan.nextInt();
    System.out.println("enter second number");
    int b = scan.nextInt();
    System.out.println("enter count");
    int count = scan.nextInt();
    for(int i = 1; i<= count;i++)
    {
        int c= a+b;
        a=b;
        b=c;
        System.out.println(c);
    }
    
}
public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    f.fib();
}
}
