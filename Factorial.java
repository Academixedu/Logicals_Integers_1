import java.util.Scanner;
public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int temp=1;
for(int i=1;i<=a;i++){
     temp=temp*i;
}
System.out.println(" The Factorial of "+a+" is:"+temp);
}
}
