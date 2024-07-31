import java.util.Scanner;

public class Fibonacci{
// Write your code here
public void scan() {
	int a,b,c,d;	
	Scanner n=new Scanner(System.in);
	System.out.println("Give Your first Number");
	a=n.nextInt();
	System.out.println("Give Second Number");
	b=n.nextInt();
	System.out.println("Give Your Count");
	d=n.nextInt();
	System.out.println("First Number"+a);
	System.out.println("Second Number"+b);
for(int e=0;e<d;e++) {
c=a+b;
System.out.print(c+",");
a=b;
b=c;
}
}	
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
         f.scan();		


}
}