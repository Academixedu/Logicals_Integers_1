import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your Number");
	int temp=0;
	int a=s.nextInt();
	for(int i=1;i<a;i++) {
		if(a%i==0)
        {
			temp=temp+i;
			System.out.println(i);
		}	
	}
	if(temp==a) {
		System.out.println("Perfect Number"+a);
	}
}
}

