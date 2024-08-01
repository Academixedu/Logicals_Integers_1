import java.util.Scanner;

public class Fibonacci
{
// Write your code here
  public void fibo()
  {
    int a,b,c,d;
    Scanner in =new Scanner(System.in);
    System.out.print("Enter your first  Number = ");
    a=in.nextInt();
    System.out.print("Enter your Second  Number = ");
    b=in.nextInt();
    System.out.print("Enter  your count = ");
    d=in.nextInt();
    System.out.print("Your First number is = "+a);
    System.out.print("Your First number is = "+b);
    for(int i=0;i<d;i++)
    {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
    
  }
  public static void main(String[] args)
   {
     new Fibonacci().fibo();
  }
}
