import java.util.Scanner;

public class PerfectNumber
{

    void perfect()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number that you have to check");
        int a=sc.nextInt();
        int temp=0;

        for (int i=1;i<a;i++)
        {
            if (a%i==0)
            {
                temp=temp+i;
                System.out.println("Factors :"+i);
            }
        }
        if (temp==a)
            {
                System.out.println(a+" is perfect number");
            }
            else 
            {
                System.out.println(a+" is not  perfect number");
            }
            sc.close();



    }

    public static void main(String[] args) {
        new PerfectNumber().perfect();
    }
}
