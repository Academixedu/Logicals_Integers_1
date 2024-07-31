import java.util.Scanner;

public class Palindrome{
// Write Your code here


    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number : ");
        int num=s.nextInt();
        int temp=0;
        int pal=num;
        while(num!=0){
            int rem=num%10;
            temp=temp*10+rem;
            num=num/10;
        }
        if(pal==temp){
            System.out.println("num is a pallindrome");
        }
        else{
            System.out.println("reversed number is: "+temp);
        }

    }
    
}

