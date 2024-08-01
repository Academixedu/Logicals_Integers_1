import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp = 1;
    int a = sc.nextInt();
    for (int i=1; i<=a; i++){
        temp = temp*i;
    } 
    System.out.println("FACTORIAL of a is : " + temp);
}
}
