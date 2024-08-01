import java.util.Scanner;

public class Fibonacci{
    // Write your code here
    public void scan(){
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
         System.out.println("give your Num:");
         a=s.nextInt();
         System.out.println("Give a sequncial Num:");
         b=s.nextInt();
         System.out.println("give the count:");
         d=s.nextInt();

         System.out.println("First Num:"+a);
         System.out.println("Second Num:"+b);

         for(int i=0;i<d;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

         }
        }
         public static void main(String[] args) {
            Fibonacci f=new Fibonacci();
            f.scan();


    }


}