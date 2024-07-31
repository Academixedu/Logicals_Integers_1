import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number : ");
    int num=s.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println(fact);


    
}
}

