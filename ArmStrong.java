import java.util.Scanner;

public class ArmStrong{
    public int counts(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }
    public void arm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int sum=0;
        int temp=a;
        int b;
        int n= counts(a);
        while(a>0){
            b=a%10;
            int power=1;
            for(int i=1;i<=n;i++){
                power *=b;
            }
            sum=sum+power;
            a=a/10;
        }
        if(temp==sum){
            System.out.println(" number is armstrong: " );
        }
        else{
            System.out.println("not a armstrong");
        }
    }
// Write your code here
public static void main(String args[]){
    ArmStrong obj=new ArmStrong();
    obj.arm();
}
}
