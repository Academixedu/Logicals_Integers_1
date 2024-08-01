import java.util.Scanner;

public class Fibonacci{
// Write your code here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter any value");
        a = sc.nextInt();
        System.out.println("Give Sequential order");
        b= sc.nextInt();
        System.out.println("Give u r count upto");
        d = sc.nextInt();
        System.out.println("FIRST NUMBER" + a);
        System.out.println("SECOND NUMBER " + b);
        for (int e=1; e<=d; e++){
            c = a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
    }
}
