import java.util.Scanner;

public class ArmStrong{
// Write your code here
public int Countdigits(int num)
{
    int count = 0;
    while(num !=0)
    {
        num = num /10;
        count ++;
    }
    return count;
}
public void Arm()
{
    int b;
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int a= scan.nextInt();
    int temp = a;
    int n = Countdigits(a);
    while(a > 0)
    {
        b = a % 10;
        int power = 1;
        for (int i =1 ;i <= n; i++ )
        {
            power *=b;

        }
        sum += power;
        a = a/10;
    }
    if(temp == sum )
    {
        System.out.println(temp+" is a Armstrong number");
    }
    else{
        System.out.println(temp+" is not a Armstrong number");
    }

}
public static void main(String[] args) {
    ArmStrong A= new ArmStrong();
    A.Arm();
}
}
