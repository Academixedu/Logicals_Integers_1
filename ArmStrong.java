

import java.util.Scanner;

public class ArmStrong {

	
    public int count(int n) {

    	int count = 0;
        while (n != 0) {

            n = n / 10;
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
        int num = count(a); 
        
        while (a > 0) {
            b = a % 10;

            int power = 1;

            for (int i=1;i<=num;i++){
                power=power*b;
            }
            sum += power;
            a = a / 10;

        }
        if (temp == sum) {
            System.out.println("It is an Armstrong");
        } else {
            System.out.println("It is not an Armstrong");
        }
    }



    public static void main(String[] args) {
        ArmStrong obj = new ArmStrong();
        obj.Arm();
    }
}
