import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int temp = 1;
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
        temp=temp*i;
    }
    System.out.println("fractional: "+temp);
}
}
