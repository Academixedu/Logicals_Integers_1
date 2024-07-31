import java.util.Scanner;
public class PerfectNumber{
// Write Your code here
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int perf=sc.nextInt();
    int temp=0;
    for(int i=1;i<perf;i++){
        if(perf%i==0){
            
            temp=temp+i;
        }
    }
        if(temp==perf){
            System.out.println("perfect number: "+temp);
        }
        else{
            System.out.println("not a perfect number");
        }
    }
    

}

