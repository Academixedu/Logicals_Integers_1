import java.util.Scanner;

public class Fibonacci{
    public void scan(){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        a=sc.nextInt();
        System.out.println("Enter the sequential number: ");
        b=sc.nextInt();
        System.out.println("Enter the count: ");
        d=sc.nextInt();
        System.out.println("The first number is: "+a);
        System.out.println("The sequential number is: "+b);
        for(int e=1;e<=d;e++){
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }


    }
    public static void main(String[] args) {
        Fibonacci fibo=new Fibonacci();
        fibo.scan();
    }
}