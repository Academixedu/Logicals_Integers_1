import java.util.Scanner;

public class Fibonacci{
// Write your code here
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a value");
    int a=sc.nextInt();
    System.out.println("enter b value");
    int b=sc.nextInt();
    int c;
    System.out.println("enter a limit");
    int limit=sc.nextInt();
    for(int i=0;i<limit;i++){
        c=a+b;//1 2 c=3 5
              //a b
              //  a b
        System.out.println(c);
        a=b;
        b=c;
    }
}
}
