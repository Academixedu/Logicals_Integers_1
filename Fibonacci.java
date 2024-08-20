import java.util.Scanner;

public class Fibonacci{
// Write your code here
public void scan(){
    int a,b,c,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Give your number: ");
    a = sc.nextInt();
    System.out.println("Give sequential number: ");
    b = sc.nextInt();
    System.out.println("Enter the number: ");
    d = sc.nextInt();
    System.out.println("First number: "+a);
    System.out.println("Second number: "+b);
    for(int i = 0;i<d;i++){
        c = a+b;
        System.out.println(c);
        a = b;
        b = c;
    }
}
public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    f.scan();
}
}
