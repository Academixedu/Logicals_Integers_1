import java.util.Scanner;

public class ArmStrong{
// Write your code here
public int countDigits(int n) {
    int count = 0;
    while (n != 0) {
        n = n / 10;
        count++;
    }
    return count;
}
public void Arm() {
    int b=0;
    int sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp = n;
    int count = countDigits(n);
    int a;
    while(n>0) {
        b = n % 10;
       int power = 1;
        for (int i = 1; i <= count; i++) {
            power = power * b;
        }
        sum = sum + power;
        n = n / 10;
    }
    if (sum == temp) {
        System.out.println("Armstrong number");
    } else {
        System.out.println("Not Armstrong number");
    }
}
public static void main(String[] args) {
    ArmStrong obj = new ArmStrong();
    obj.Arm();
}
}