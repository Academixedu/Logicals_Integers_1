import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args){
    int temp=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    for(int i=1;i<a;i++){
        if(a%i==0){
            temp = temp+i;
        }
    }
    if(a == temp){
        System.out.println("perfect num");
    }
    else{
        System.out.println("not perfect num");
    }
}
}
