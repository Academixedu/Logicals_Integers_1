
import java.util.Scanner;
public class ArmStrong{
// Write your code here
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int temp = n;
    while(n > 0){
        int rem = n % 10;
        sum = sum + (rem * rem * rem);
        n = n / 10;
    }
    if(sum == temp){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not Armstrong");
    }
}
}
