import java.util.Scanner;

public class ArmStrong {
    public static int countDigits(int num){
        int count=0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int b = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int a = sc.nextInt();
        int temp = a;
        int n = countDigits(a);
        while(a>0){
            b = a % 10;
            int power = 1;
            for(int i=1;i<=n;i++){
                power *= b;
            }
            sum += power;
            a = a/10;
        }
        if(temp == sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not ar");
        }
    }
}
