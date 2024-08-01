import java.util.Scanner;

public class ArmStrong {
    // Method to count the number of digits in a number
    public int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public void Arm() {
        int b;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = in.nextInt();
        int temp = a;
        int n = countDigits(a); // Calculate the number of digits in the input number
        
        while (a > 0) {
            b = a % 10;
            int power = 1;
            for (int i = 1; i <= n; i++) {
                power *= b;
            }
            sum += power;
            a = a / 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        ArmStrong m = new ArmStrong();
        m.Arm();
    }
}
