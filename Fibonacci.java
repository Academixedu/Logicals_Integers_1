import java.util.Scanner;

public class Fibonacci
{

    void meth1()
    {   
        int a,b,c,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        a=sc.nextInt();
        System.out.println("Enter th second value : ");
        b=sc.nextInt();

        System.out.println("Enter the count for fibonacci series :");
        count=sc.nextInt();

        for (int i=1;i<=count;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
        sc.close();

    }

    public static void main(String[] args)
     {
        new Fibonacci().meth1();    
    }
}