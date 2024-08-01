import java.util.Scanner;
public class ArmStrong 
{
    // Write your code here

    int countDigits(int num) 
    {
        int count = 0;
        while (num != 0)// condition
        {

            num = num / 10;
            count++;
        }
        return count;
    }
    public void arm()
    {
        Scanner in=new Scanner(System.in);
        int b;
        int sum=0;
        System.out.print("Enter the value = ");
        int a=in.nextInt();
        int temp=a;
        int n=countDigits(a);

        while(a>0)
        {
           b=a%10;
           int power=1;
           for(int i=1;i<=n;i++)
           {
            power=power*b;
        }
        sum=sum+power;
        a=a/10;
        }
        if (temp==sum) 
        {
            System.out.println("this is ArmStrong Value");
        }
        else
        {
            System.out.println("this is not ArmStrong Value");
        }
       in.close(); 
    }
    public static void main(String[] args) 
    {
        new ArmStrong().arm();
    }

}