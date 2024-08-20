import java.util.Scanner;
public class Fibonacci{

// Write your code here
public void scan() {
    int a,b,c,d;	
    Scanner sc=new Scanner(System.in);
	System.out.println("Give Your Number");
	a=sc.nextInt();
	System.out.println("Give Sequential Number");
	b=sc.nextInt();
	System.out.println("Give Your Count");
	d=sc.nextInt();
	System.out.println("First Number"+a);
	System.out.println("Second Number"+b);
    for(int e=0;e<d;e++) 
    {
        c=a+b;
        System.out.print(c);
        a=b;
        b=c;
    }
}	
public static void main(String[] args) {
    Fibonacci f=new Fibonacci();
    f.scan();		
}
}

