import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int fn=sc.nextInt();
    int temp=1;
    for(int i=1;i<=fn;i++){
        
        temp *=i;       
    } 
    System.out.println(temp);
    }
}

