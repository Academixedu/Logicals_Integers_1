import java.util.Scanner;

// Write Your code here
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Number = ");
        int a = in.nextInt();
        int temp = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                temp = temp + i;
                System.out.println(i);
            }
        }
        if (temp == a) {
            System.out.println(a + " is a perfect number ");
        } else {
            System.out.println(a + " is not a perfect number ");
        }
    }
}