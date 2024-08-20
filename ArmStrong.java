
public class ArmStrong {

 
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

      
        while (number != 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 254; 

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
