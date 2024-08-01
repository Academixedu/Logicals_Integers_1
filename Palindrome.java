import java.util.Scanner;
public class Palindrome{
// Write Your code here
public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    System.out.println("enter number");
    int num=a.nextInt();
    int temp=0;
    int pal=num;
    while(num>0){
        int rem=num%10;
        temp=temp*10+rem;
        num=num/10;
    
    }
    if(temp==pal){
        System.out.println("palindome");
    }
    else {
        System.out.println("not a palindrome");
    }
}
}
