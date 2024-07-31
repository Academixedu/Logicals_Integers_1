import java.util.Scanner;
public class PerfectNumber{
public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int temp=0;

        for(int i=1;i<a;i++){
           if(a%i==0){
            temp =temp+a;
            System.out.println(a);
           
        }
    
           if(temp==a){
            System.out.println("perfect no "+a);
           }
           }
}
}
    
    
    
// Write Your code here

