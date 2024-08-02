import java.util.Scanner;
public class Palindrome{
// Write Your code here
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter a number");
     int a=sc.nextInt();
     int temp=0;
     int pal=a;
     while(a!=0){
        int rem=a%10;
        temp=temp*10+rem;
        a=a/10;
     }
     if(temp==pal){
     System.out.println(pal+"is palindrome number");
     }
     else{
        System.out.println(pal+"is not a palindrome");
     }
}
}
