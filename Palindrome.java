import java.util.Scanner;

public class Palindrome
{       
    void meth1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int a=sc.nextInt();
        int temp=0;
        int flag=a;

        while(a>0)
        {
            int rem=a%10;
            temp=temp*10+rem;
            a=a/10;
        }

        if (temp==flag)
        {
            System.out.println(temp+" is palindrome number");
        }
        else
        {
            System.out.println(temp+" is a reverse of "+flag);
        }
        sc.close();
    }

    public static void main(String[] args) 
    {
        new Palindrome().meth1();
    }
}
