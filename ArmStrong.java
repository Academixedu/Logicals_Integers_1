import java.util.Scanner;

public class ArmStrong{
// Write your code here
public static void main(String[] args) {
    Scanner ds=new Scanner(System.in);
    System.out.println("enter the number");
    int num=ds.nextInt();
    int temp,rem,result=0,n=0;
    temp=num;
    for(;temp!=0;temp /= 10,++n);
        temp=num;
        rem=temp%10;
        for(;temp!=0;temp /=10){
            rem=temp % 10;
            result+=Math.pow(rem,n);
        }
        if(result==num){
            System.out.println("it is armstrong: "+num);
        }else{
            System.out.println("it is not a armstrong: "+num);
        }

    
}

}

