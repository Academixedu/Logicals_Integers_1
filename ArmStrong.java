import java.util.Scanner;
public class ArmStrong{
// Write your code here
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Give your Value");
    int a = sc.nextInt();
    int temp = a;
    int n = countDigits(a); 
    while (a > 0) {
        b = a % 10;
        int power = 1;
        for (int i = 1; i <=n; i++) {
            power *= b;
        }
        sum += power;
        a = a / 10;
    }
    if (temp == sum) {
        System.out.println(temp + " is an Armstrong");
    } else {
        System.out.println(temp + " is not an Armstrong");
    }
}

public static void main(String[] args) {
    ArmStrong m = new ArmStrong();
    m.Arm();
}
}


