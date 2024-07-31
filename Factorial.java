import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int temp=1;
    int a=s.nextInt();
    for(int i=1;i<=a;i++)
    {
        temp=temp*i;	
    }
    System.out.println("factorial:"+temp);
}
}

