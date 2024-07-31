import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int a=sc.nextInt();
        System.out.print("Enter Sequential Number:");
        int b=sc.nextInt();
        System.out.print("Enter Count value:");
        int d=sc.nextInt();
        System.out.println("Fibonacci Series:");
        for(int e=0;e<d;e++){
            int c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }

}
