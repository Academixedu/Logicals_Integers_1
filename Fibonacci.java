import java.util.Scanner;

public class Fibonacci{
// Write your code here
 public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a= s.nextInt();
        System.out.println("enter second number : ");
        int b= s.nextInt();
        System.out.println("enter count : ");
        int c=s.nextInt();
        System.out.println("First number: "+a);
        System.out.println("First number: "+b);

        for(int d=0;d<=c;d++){
         int e=a+b;
            System.out.println(e);
            a=b;
            b=e;
        }



    }

}
