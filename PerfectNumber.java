import java.util.Scanner;
public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number");
    int a=s.nextInt();
    int temp=0;
    for(int i=1;i<a;i++){
        if(a%i==0){
        temp=temp+i;
        System.out.println(i);
    }
    }
    if(temp==a){
        System.out.println("perfect number");
    }
    else {
        System.out.println("not a perfect number");
    }
}
}
