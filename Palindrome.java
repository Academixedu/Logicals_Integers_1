import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Num:");
        int a=s.nextInt();
        int temp=0;
        int pal=a;
        while(a!=0)
        {
           int  rem=a%10;
            temp=temp*10+rem;
            a=a/10;
        }
        if(pal==temp){
            System.out.println("Palindrom----------"+temp);
        }else{
            System.out.println("Reminder-----------"+temp);
        }
    }

// Write Your code here
}
