import java.util.Scanner;
public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int a=in.nextInt();
        int temp=0;

        for(int i=1;i<a;i++){
           if(a%i==0){
            temp =temp+i;
            System.out.println(i);

        }
        }
           if(temp==a){
            System.out.println("perfect number "+a);
           }
           else{
            System.out.println("not perfect number");
           }
        }
    }