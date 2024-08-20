import java.util.Scanner;

public class ArmStrong {

    public boolean isArmstrong(int n) {
        int original = n, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        ArmStrong arm = new ArmStrong();
        System.out.println(number + " is an Armstrong number: " + arm.isArmstrong(number));
    }
}
