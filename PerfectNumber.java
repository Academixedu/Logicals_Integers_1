import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                temp=temp+i;
                System.out.println("Factors of i:"+i);
            }
        }
        if(temp==a){
            System.out.print(a+" is a Perfect Number");
        }
        else{
            System.out.println(a+" is not a Perfect Number");
        }
    }

}
