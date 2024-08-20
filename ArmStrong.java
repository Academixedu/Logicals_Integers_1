import java.util.Scanner;
public class ArmStrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        while(a>0){
            int rem=a%10;
            sum=sum+(rem*rem*rem);
            a=a/10;
        }
        if(temp==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
// Write your code here
}
