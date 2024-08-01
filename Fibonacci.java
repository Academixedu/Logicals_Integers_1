import java.util.Scanner;
public class Fibonacci{
// Write your code here
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a,b,c,d;
    System.out.println("enter number 1");
    a=s.nextInt();
    System.out.println("enter sequential number");
    b=s.nextInt();
    System.out.println("enter count");
    d=s.nextInt();
    System.out.println("numbera"+a);
    System.out.println("number b"+b);
    for(int i=0;i<d;i++){
    c=a+b;
    System.out.println(c);
    a=b;
    b=c;}
    
}
}
