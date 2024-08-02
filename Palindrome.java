import java.util.Scanner;

public class Palindrome{
// Write Your code here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value");
    int a = sc.nextInt();
    int pal = a;
    int temp = 0;
    while (a!=0) {
     int rem = a%10;   
     temp = temp*10+rem;
     a = a/10; 
    }
    if(pal == temp){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
}
}
