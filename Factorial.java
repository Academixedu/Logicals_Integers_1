import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int temp=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
                temp=temp*i;
                System.out.println("Factorial:"+temp);
           
        }
    }

}
