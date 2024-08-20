import java.util.Scanner;

public class Palindrome{
// Write Your code here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    int a=sc.nextInt();
    int temp=a;
    int rev=0;
    while(a!=0){
        int rem=a%10;
        rev=rev*10+rem;
        a=a/10;
    }
    if(temp==rev){
        System.out.println("Palindrome"+temp);
    }
    else{
        System.out.println("Not Palindrome"+temp);
    }
}
}
