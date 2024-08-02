import java.util.Scanner;
public class ArmStrong{
// Write your code here
public int countdigits(int a){
    int count=0;
    while(a>0){
        a=a/10;
        count++;
    }
    return count;
}
    public void Arm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int temp=a;
        int n=countdigits(a);
        int sum=0;
        while(a>0){
            int b=0;
            b=a%10;
            int power=1;
            for(int i=1;i<=n;i++)
            {
             power=power*b;
            }
             sum=sum+power;
             a=a/10;
        }
        if(sum==temp){
        System.out.println(temp+"is an armstrong number");
    }
    else{
        System.out.println(temp+"not a armstrong");S
    }
}
    public static void main(String args[]){
        ArmStrong s=new ArmStrong();
          s.Arm();
    }

}
