import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int temp=0;
    int a=scan.nextInt();
    for(int i=1;i<a;i++){
        if(a%i==0){
            temp=temp*i;
            System.out.println(i);
        }
        if(temp==a){
            System.out.println("The entered number is a Perfect Number: "+a);
        }
        else{
            System.out.println("The entered number is not a Perfect Number: "+a);
        }
    }
}
}
