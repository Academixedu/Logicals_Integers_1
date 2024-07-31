import java.util.Scanner;

public class Palindrome{
// Write Your code here
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int a=scan.nextInt();
    int temp=0;
    int pal=a;
    while(a!=0){
        int rem=a%10;
        temp=temp*10+rem;
        a=a/10;
    }
    if(pal==temp){
        System.out.println("The entered number "+temp+" is a palindrome");
    }
    else{
        System.out.println("The entered number "+temp+"is not a palindrome");
    }
}
}
