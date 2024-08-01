import java.util.Scanner;

public class Fibonacci{
// Write your code here
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the value");
    int a=in.nextInt();
    System.out.println("enter the sequential value");
    int b=in.nextInt();
    System.out.println("enter the count");
    int d=in.nextInt();
    System.out.println("fibnacci series");
    for(int e=0;e<=d;e++){
        int c=a+b;
        System.out.println(c+",");
        a=b;
        b=c;
    }
    
}
}
