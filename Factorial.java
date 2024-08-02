import java.util.Scanner;

public class Factorial{
// Write Your Code Here
public static void main(String[] args){
    int temp=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    int a = sc.nextInt();
    for(int i=1;i<=a;i++){
        temp = temp*i;
    }
    System.out.println(temp);
}
}
