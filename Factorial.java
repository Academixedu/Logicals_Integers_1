public class Factorial {

    // Method to calculate factorial using iteration
    public static int factorialIterative(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 6; 
        System.out.println("Factorial of " + number + " is: " + factorialIterative(number));
    }
}
