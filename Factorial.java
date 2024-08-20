import java.util.Scanner;

public class Factorial {

    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial fact = new Factorial();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factorial = fact.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
