import java.util.Scanner;
public class Palindrome{
// Write Your code here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int rev = 0;
    while(num > 0){
        int rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }
    if(rev == temp){
        System.out.println(temp + " is a Palindrome");
    }
    else{
        System.out.println(temp + " is not a Palindrome");
    }
}
}
