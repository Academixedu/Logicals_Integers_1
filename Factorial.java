import java.util.Scanner;

public class Factorial
{

    void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for factorial");
        int a=sc.nextInt();
        long fact=1;

        while (a!=0) 
        {
            fact=fact*a;
            a--;
        }

        System.out.println("The factorial of given numver is :"+fact);
        sc.close();


    }

    public static void main(String[] args) 
    {
        new Factorial().meth();
    }

}