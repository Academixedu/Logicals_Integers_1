//number = sum of the factors//
//6 =1+2+3//
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number :");
        int num=s.nextInt();
        int temp=0;
        for(int i=1;i<num;i++){
            if(num % i==0){
                temp=temp+i;
            }
        }
        if(temp==num){
            System.out.println("number is perfect number");
        }

        else{
            System.out.println("number is not a perfect number");
        }
    }

    
}