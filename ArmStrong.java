import java.util.Scanner;

public class ArmStrong
{

        int countDigits(int num)
        {
            int count=0;
            
            while(num!=0)
            {
                num=num/10;
                count++;
            }

                return count;
        }
 
        public void arm()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value");
            int a=sc.nextInt();
            int b;
            int sum=0;
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

            if(temp==sum)
            {
                System.out.println(temp+" is an armstrong number");
            }
            else
            {
                System.out.println(temp+" is not an armstrong number");
            }
            sc.close();
        }

    public static void main(String[] args) 
    {
       ArmStrong arm=new ArmStrong();   
       arm.arm();
    }
}
