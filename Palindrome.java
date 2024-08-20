
import java.util.Scanner;

public class Palindrome{

    
// Write Your code here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    int temp = 0;
    int rev = a;

    while (a != 0) {
        int rem = a % 10;
        temp = temp * 10 + rem;
        a = a / 10;
    }

    if (temp == rev) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
    
    
}
}
