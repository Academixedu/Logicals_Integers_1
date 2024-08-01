import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a number");
    int a = scan.nextInt();
    int temp = 0;
    for(int i =1;i<a;i++)
    {
        if(a % i==0)
        {
            temp = temp+i;
            System.out.println(i);
        }
    }
    if(temp == a)
    {
        System.out.println(a+" it is a perfect number");
    }
    else
    {
        System.out.println(a+" is not a perfect number");
    }
}
}
