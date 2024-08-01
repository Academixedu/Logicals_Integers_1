import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter u number: " );
        int temp = 0;
        int a = sc.nextInt();
        for (int i =1; i<=a ;i++){
            if(a%i==0){
                temp = temp + i;
                System.out.println(i);
            }
        }
        if(temp==a){
            System.out.println("PERFECT NUMBER " + a);
        }
     }
     
}
