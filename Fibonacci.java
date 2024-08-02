 import java.util.Scanner;

public class Fibonacci{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
int a,b,c,d;
System.out.println("enter a");    
a=in.nextInt();
System.out.println("enter b");
b=in.nextInt();
System.out.println("enter d");
d=in.nextInt();
for(int i=0;i<d;i++){
    c=a+b;
    a=b;
    b=c;
    System.out.println("fibonocci is : "+c);

}

}
}
