import java.util.Scanner;

public class Fibonacci{
// Write your code here
public static void main(String[] args) {
    int a,b,c,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the initial value");
    a = sc.nextInt();
    System.out.println("enter the sequence number");
    b = sc.nextInt();
    System.out.println("the the count");
    d = sc.nextInt();
    System.out.println(" ");
    System.out.print(a+",");
    System.out.print(b+",");
    for(int i=0;i<=d;i++){
        c = a+b;
        System.out.print(c+",");
        a = b;
        b = c; 
    }
}
}
